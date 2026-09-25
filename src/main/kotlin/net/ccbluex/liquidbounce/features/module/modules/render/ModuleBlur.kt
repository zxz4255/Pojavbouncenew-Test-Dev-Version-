package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object Blur : ClientModule("Blur", ModuleCategories.RENDER) {
    val isBlurEffectActive: Boolean get() = false
}

object FeatureSilentScreen {
    val shouldHide: Boolean get() = false
    val isBlurEffectActive: Boolean get() = false
}
