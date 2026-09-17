package com.ai.assistance.operit.api.chat.llmprovider

import android.content.Context
import com.ai.assistance.operit.core.chat.hooks.PromptTurn
import com.ai.assistance.operit.data.model.ApiProviderType
import com.ai.assistance.operit.data.model.ChatMessage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LlamaProvider(
    private val context: Context,
    private val modelName: String,
    private val providerType: ApiProviderType = ApiProviderType.LLAMA_CPP,
    private val enableToolCall: Boolean = false
) : AIService {
    override suspend fun generateStream(
        messages: List<ChatMessage>,
        onProgress: (String) -> Unit
    ): Flow<String> = flow {
        emit("当前版本为精简纯净版，已移除本地 Llama 模型推理，请在设置中切换为云端 API 模型（如 OpenAI、DeepSeek 等）。")
    }

    override suspend fun generateWithHistory(
        messages: List<ChatMessage>,
        turns: List<PromptTurn>,
        onProgress: (String) -> Unit
    ): Flow<String> = flow {
        emit("当前版本为精简纯净版，已移除本地 Llama 模型推理，请在设置中切换为云端 API 模型。")
    }
}
