package com.tonisives.githubbrowser.shared

import com.github.aakira.napier.Napier

val platform = Platform()

fun i(message: String) {
    Napier.i(message)
}

class Greeting {
    fun greeting(): String {
        val message = "Hello, ${platform.platform}!"
        Napier.i(message)
        return message
    }
}
