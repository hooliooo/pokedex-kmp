import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget


plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
}

kotlin {
    //select iOS target platform depending on the Xcode environment variables
    val iOSTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iOSTarget("ios") {
        binaries {
            framework {
                baseName = "shared"
            }
        }
    }


    jvm("android")

    sourceSets {
        all {
            languageSettings.useExperimentalAnnotation("kotlinx.serialization.UnstableDefault")
        }
        val commonMain by getting {
            dependencies {
                implementation(Libs.kotlin_stdlib_common)
                implementation(Libs.ktor_client_core)
                implementation(Libs.ktor_client_json)
                implementation(Libs.ktor_client_serialization)
                implementation(Libs.kotlinx_coroutines_core_common)
                implementation(Libs.kotlinx_serialization_runtime_common)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        named("androidMain") {
            dependencies {
                implementation(Libs.kotlin_stdlib)
                implementation(Libs.ktor_client_android)
                implementation(Libs.ktor_client_okhttp)
                implementation(Libs.ktor_client_json_jvm)
                implementation(Libs.ktor_client_serialization_jvm)
                implementation(Libs.kotlinx_coroutines_android)
                implementation(Libs.kotlinx_serialization_runtime)
            }
        }

        named("androidTest") {
            dependencies {
                implementation(Libs.kotlin_test)
                implementation(Libs.kotlin_test_junit)
                implementation(Libs.kotlinx_coroutines_test)
            }
        }

        named("iosMain") {
            dependencies {
                implementation(Libs.ktor_client_ios)
                implementation(Libs.ktor_client_core_native)
                implementation(Libs.ktor_client_json_native)
                implementation(Libs.ktor_client_serialization_native)
                implementation(Libs.kotlinx_coroutines_core_native)
                implementation(Libs.kotlinx_serialization_runtime_native)
            }
        }
    }
}

val packForXcode by tasks.creating(Sync::class) {
    val targetDir = File(buildDir, "xcode-frameworks")

    /// selecting the right configuration for the iOS
    /// framework depending on the environment
    /// variables set by Xcode build
    val mode = System.getenv("CONFIGURATION") ?: "DEBUG"
    val framework = kotlin.targets
        .getByName<KotlinNativeTarget>("ios")
        .binaries.getFramework(mode)
    inputs.property("mode", mode)
    dependsOn(framework.linkTask)

    from({ framework.outputDirectory })
    into(targetDir)

    /// generate a helpful ./gradlew wrapper with embedded Java path
    doLast {
        val gradlew = File(targetDir, "gradlew")
        gradlew.writeText("#!/bin/bash\n"
                + "export 'JAVA_HOME=${System.getProperty("java.home")}'\n"
                + "cd '${rootProject.rootDir}'\n"
                + "./gradlew \$@\n")
        gradlew.setExecutable(true)
    }
}

tasks.getByName("build").dependsOn(packForXcode)