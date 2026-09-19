package net.ccbluex.liquidbounce.features.module.modules.combat.criticals

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleCriticals : ClientModule("Criticals", ModuleCategories.COMBAT) {
    fun wouldDoCriticalHit(ignoreSprint: Boolean = false): Boolean = false
}
