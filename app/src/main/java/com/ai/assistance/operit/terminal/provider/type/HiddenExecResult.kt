package com.ai.assistance.operit.terminal.provider.type

data class HiddenExecResult(
    val exitCode: Int = -1,
    val output: String = "终端已被精简移除",
    val error: String? = "终端已被精简移除"
)
