import kotlin.String

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
  /**
   * https://developer.android.com/jetpack/androidx
   */
  const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.appcompat

  /**
   * http://tools.android.com
   */
  const val constraintlayout: String = "androidx.constraintlayout:constraintlayout:" +
      Versions.constraintlayout

  /**
   * http://developer.android.com/tools/extras/support-library.html
   */
  const val core_ktx: String = "androidx.core:core-ktx:" + Versions.core_ktx

  /**
   * https://developer.android.com/testing
   */
  const val espresso_core: String = "androidx.test.espresso:espresso-core:" + Versions.espresso_core

  /**
   * https://developer.android.com/testing
   */
  const val androidx_test_runner: String = "androidx.test:runner:" + Versions.androidx_test_runner

  /**
   * https://developer.android.com/studio
   */
  const val aapt2: String = "com.android.tools.build:aapt2:" + Versions.aapt2

  /**
   * https://developer.android.com/studio
   */
  const val com_android_tools_build_gradle: String = "com.android.tools.build:gradle:" +
      Versions.com_android_tools_build_gradle

  /**
   * https://developer.android.com/studio
   */
  const val lint_gradle: String = "com.android.tools.lint:lint-gradle:" + Versions.lint_gradle

  const val de_fayard_buildsrcversions_gradle_plugin: String =
      "de.fayard.buildSrcVersions:de.fayard.buildSrcVersions.gradle.plugin:" +
      Versions.de_fayard_buildsrcversions_gradle_plugin

  /**
   * https://github.com/ktorio/ktor
   */
  const val ktor_client_android: String = "io.ktor:ktor-client-android:" + Versions.io_ktor

  /**
   * https://github.com/ktorio/ktor
   */
  const val ktor_client_core: String = "io.ktor:ktor-client-core:" + Versions.io_ktor

  /**
   * https://github.com/ktorio/ktor
   */
  const val ktor_client_ios: String = "io.ktor:ktor-client-ios:" + Versions.io_ktor

  /**
   * http://junit.org
   */
  const val junit: String = "junit:junit:" + Versions.junit

  /**
   * https://kotlinlang.org/
   */
  const val kotlin_android_extensions_runtime: String =
      "org.jetbrains.kotlin:kotlin-android-extensions-runtime:" + Versions.org_jetbrains_kotlin

  /**
   * https://kotlinlang.org/
   */
  const val kotlin_android_extensions: String = "org.jetbrains.kotlin:kotlin-android-extensions:" +
      Versions.org_jetbrains_kotlin

  /**
   * https://kotlinlang.org/
   */
  const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" +
      Versions.org_jetbrains_kotlin

  /**
   * https://kotlinlang.org/
   */
  const val kotlin_scripting_compiler_embeddable: String =
      "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:" + Versions.org_jetbrains_kotlin

  /**
   * https://kotlinlang.org/
   */
  const val kotlin_stdlib_common: String = "org.jetbrains.kotlin:kotlin-stdlib-common:" +
      Versions.org_jetbrains_kotlin

  /**
   * https://kotlinlang.org/
   */
  const val kotlin_stdlib_jdk7: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:" +
      Versions.org_jetbrains_kotlin

  /**
   * https://kotlinlang.org/
   */
  const val kotlin_stdlib: String = "org.jetbrains.kotlin:kotlin-stdlib:" +
      Versions.org_jetbrains_kotlin

  /**
   * https://github.com/Kotlin/kotlinx.coroutines
   */
  const val kotlinx_coroutines_android: String =
      "org.jetbrains.kotlinx:kotlinx-coroutines-android:" + Versions.org_jetbrains_kotlinx

  /**
   * https://github.com/Kotlin/kotlinx.coroutines
   */
  const val kotlinx_coroutines_core_common: String =
      "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:" + Versions.org_jetbrains_kotlinx

  const val kotlinx_coroutines_core_native: String =
      "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:" + Versions.org_jetbrains_kotlinx
}
