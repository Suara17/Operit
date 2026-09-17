package com.ai.assistance.operit.util.ripgrep

internal object NativeRipgrep {
    @JvmStatic
    fun searchJson(
        path: String,
        patterns: Array<String>,
        filePattern: String,
        caseInsensitive: Boolean,
        literal: Boolean,
        contextLines: Int,
        maxResults: Int
    ): String {
        return "[]"
    }
}

