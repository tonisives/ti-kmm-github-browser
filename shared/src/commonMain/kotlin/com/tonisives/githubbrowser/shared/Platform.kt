package com.tonisives.githubbrowser.shared

expect class Platform() {
    fun setupLogging()
    val platform: String
}