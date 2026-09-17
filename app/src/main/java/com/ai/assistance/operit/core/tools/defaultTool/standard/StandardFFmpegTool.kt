package com.ai.assistance.operit.core.tools.defaultTool.standard

import android.content.Context
import com.ai.assistance.operit.core.tools.StringResultData
import com.ai.assistance.operit.core.tools.ToolExecutor
import com.ai.assistance.operit.data.model.AITool
import com.ai.assistance.operit.data.model.ToolResult
import com.ai.assistance.operit.data.model.ToolValidationResult

/**
 * FFmpeg tools are disabled in Lite Cloud Chat version.
 */
class StandardFFmpegToolExecutor(private val context: Context) : ToolExecutor {
    override fun invoke(tool: AITool): ToolResult {
        return ToolResult(
            toolName = tool.name,
            success = false,
            result = StringResultData(""),
            error = "FFmpeg tool is disabled in Lite version"
        )
    }

    override fun validateParameters(tool: AITool): ToolValidationResult {
        return ToolValidationResult(valid = true)
    }
}

class StandardFFmpegInfoToolExecutor : ToolExecutor {
    override fun invoke(tool: AITool): ToolResult {
        return ToolResult(
            toolName = tool.name,
            success = false,
            result = StringResultData(""),
            error = "FFmpeg info is disabled in Lite version"
        )
    }

    override fun validateParameters(tool: AITool): ToolValidationResult {
        return ToolValidationResult(valid = true)
    }
}

class StandardFFmpegConvertToolExecutor(private val context: Context) : ToolExecutor {
    override fun invoke(tool: AITool): ToolResult {
        return ToolResult(
            toolName = tool.name,
            success = false,
            result = StringResultData(""),
            error = "FFmpeg convert is disabled in Lite version"
        )
    }

    override fun validateParameters(tool: AITool): ToolValidationResult {
        return ToolValidationResult(valid = true)
    }
}
