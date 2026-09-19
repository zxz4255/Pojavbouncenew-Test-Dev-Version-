package net.ccbluex.liquidbounce.features.module.modules.combat.backtrack

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleBacktrack : ClientModule("Backtrack", ModuleCategories.COMBAT) {
    fun isLagging(): Boolean = false
}
