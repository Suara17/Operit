package com.dragonbones

import android.content.Context
import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

open class DragonBonesController {
    open fun play(animationName: String) {}
    open fun stop() {}
}

open class DragonBonesModel

object JniBridge

@Composable
fun DragonBonesViewCompose(
    modifier: Modifier = Modifier,
    controller: DragonBonesController? = null,
    model: DragonBonesModel? = null
) {}
