package com.julio.alorro.pokedex

import io.ktor.client.HttpClient
import io.ktor.client.engine.ios.Ios
import platform.Foundation.NSURLRequestReturnCacheDataElseLoad

actual val APIEngine = HttpClient(Ios) {
    engine {
        configureRequest {
            setCachePolicy(NSURLRequestReturnCacheDataElseLoad)
            setTimeoutInterval(10.0)
        }
    }
}