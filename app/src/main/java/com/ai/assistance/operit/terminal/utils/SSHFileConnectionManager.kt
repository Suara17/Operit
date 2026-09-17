package com.ai.assistance.operit.terminal.utils

import android.content.Context

class SSHFileConnectionManager private constructor() {
    companion object {
        @Volatile
        private var instance: SSHFileConnectionManager? = null

        fun getInstance(context: Context): SSHFileConnectionManager {
            return instance ?: synchronized(this) {
                instance ?: SSHFileConnectionManager().also { instance = it }
            }
        }
    }
}
