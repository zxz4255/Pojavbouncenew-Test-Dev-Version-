package net.ccbluex.liquidbounce.features.module.modules.combat

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleSwordBlock : ClientModule("SwordBlock", ModuleCategories.COMBAT) {
    val hideShieldSlot: Boolean = false
    fun shouldHideOffhand(): Boolean = false
}
