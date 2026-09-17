package com.ai.assistance.operit.terminal

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class CommandExecutionEvent(val command: String = "")
data class SessionDirectoryEvent(val path: String = "")

class TerminalState {
    val sessions = emptyList<TerminalSession>()
    val activeSession: TerminalSession? = null
}

class TerminalSession(val id: String = "", val title: String = "") {
    val pty: TerminalPty? = null
}

class TerminalPty(val pid: Int = -1)

class TerminalManager private constructor() {
    val terminalState: StateFlow<TerminalState> = MutableStateFlow(TerminalState())

    fun getFileSystemProvider(): com.ai.assistance.operit.terminal.provider.filesystem.FileSystemProvider {
        return com.ai.assistance.operit.terminal.provider.filesystem.FileSystemProvider()
    }

    companion object {
        @Volatile
        private var instance: TerminalManager? = null

        fun getInstance(context: Context): TerminalManager {
            return instance ?: synchronized(this) {
                instance ?: TerminalManager().also { instance = it }
            }
        }
    }
}

@Composable
fun rememberTerminalEnv(): Any? = null
