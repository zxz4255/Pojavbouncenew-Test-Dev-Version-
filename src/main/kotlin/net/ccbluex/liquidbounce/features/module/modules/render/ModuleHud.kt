package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleHud : ClientModule("HUD", ModuleCategories.RENDER) {
    var hudEditorSelected: Boolean = false
    val isBlurEffectActive: Boolean get() = false

    fun reopen() {}
    fun updateThemes() {}

    object Blur {
        val alphaBlendRange: ClosedFloatingPointRange<Float> = 0f..1f
        val sigma: Float = 1f
    }
}
