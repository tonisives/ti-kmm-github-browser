package com.tonisives.githubbrowser.shared

import co.touchlab.kermit.CommonLogger
import co.touchlab.kermit.Kermit

val kermit = Kermit(CommonLogger())

class Greeting {

    fun greeting(): String {
        val message = "Hello, ${Platform().platform}!"
        kermit.i { message }
        return message
    }
}
