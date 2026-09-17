package com.ai.assistance.fbx

import android.content.Context
import android.util.AttributeSet
import android.view.View

open class FbxGlSurfaceView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : View(context, attrs)

data class FbxModelInfo(
    val isValid: Boolean = false,
    val errorMessage: String? = null
)

object FbxInspector {
    fun inspect(path: String): FbxModelInfo = FbxModelInfo(isValid = false, errorMessage = "轻量版已移除FBX引擎")
}
