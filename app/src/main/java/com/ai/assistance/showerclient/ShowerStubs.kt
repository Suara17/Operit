package com.ai.assistance.showerclient

data class ShellCommandResult(
    val exitCode: Int = -1,
    val output: String = "",
    val error: String? = "已精简移除Shower环境"
)

enum class ShellIdentity {
    SHELL, ROOT, SYSTEM
}

interface ShellRunner {
    fun execute(command: String, identity: ShellIdentity = ShellIdentity.SHELL): ShellCommandResult
}

class ShowerEnvironment {
    companion object {
        var shellRunner: ShellRunner? = null
        var logSink: Any? = null
        var emitToSystemLog: Boolean = false
    }
}

fun interface ShowerLogSink {
    fun log(priority: Int, tag: String, message: String, throwable: Throwable?)
}

open class ShowerBinderRegistry {
    companion object {
        fun register(name: String, binder: Any?) {}
    }
}

open class ShowerController {
    companion object {
        fun shutdown() {}
    }
}

open class ShowerServerManager {
    companion object {
        fun stop() {}
    }
}
