package net.ccbluex.liquidbounce.features.module.modules.combat.killaura

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.entity.Entity

object ModuleKillAura : ClientModule("KillAura", ModuleCategories.COMBAT) {
    object targetTracker {
        val target: Entity? get() = null
    }
    val target: Entity? get() = null
}
