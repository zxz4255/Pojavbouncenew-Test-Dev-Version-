package net.ccbluex.liquidbounce.features.module.modules.combat.killaura

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.entity.Entity

object ModuleKillAura : ClientModule("KillAura", ModuleCategories.COMBAT) {
    /** stub tracker */
    object targetTracker {
        fun enemies(): Collection<Entity> = emptyList()
        val target: Entity? get() = null
    }
}
