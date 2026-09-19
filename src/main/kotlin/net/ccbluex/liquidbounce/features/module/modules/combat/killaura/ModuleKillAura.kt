package net.ccbluex.liquidbounce.features.module.modules.combat.killaura

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.entity.Entity

object ModuleKillAura : ClientModule("KillAura", ModuleCategories.COMBAT) {
    @JvmField
    val range = RangeStub

    object RangeStub {
        @Suppress("UNUSED_PARAMETER")
        fun migrateFromValues(valuesByName: Any?) {}
        fun getInteractionRange(): Float = 3f
        fun getInteractionThroughWallsRange(): Float = 3f
    }

    object targetTracker {
        fun enemies(): Collection<Entity> = emptyList()
        fun targets(): Collection<Entity> = emptyList()
        val target: Entity? get() = null
    }
}
