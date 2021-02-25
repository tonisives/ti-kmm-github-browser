package com.tonisives.githubbrowser.shared

import com.github.aakira.napier.Napier
import platform.UIKit.UIDevice
import com.github.aakira.napier.DebugAntilog

actual class Platform actual constructor() {
    actual fun setupLogging() {
        Napier.base(DebugAntilog())
    }

    actual val platform: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}