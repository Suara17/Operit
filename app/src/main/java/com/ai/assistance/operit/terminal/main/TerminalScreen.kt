package com.ai.assistance.operit.terminal.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TerminalScreen(
    modifier: Modifier = Modifier,
    onBack: (() -> Unit)? = null
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("轻量版已移除终端环境")
    }
}
