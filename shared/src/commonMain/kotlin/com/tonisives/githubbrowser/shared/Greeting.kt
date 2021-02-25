package com.tonisives.githubbrowser.shared

import com.github.florent37.log.Logger

class Greeting {
    fun greeting(): String {
        val message = "Hello, ${Platform().platform}!"
        Logger.d("TAG", message)
        return message
    }
}
