package net.ccbluex.liquidbounce.features.module.modules.movement

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleTeleport : ClientModule("Teleport", ModuleCategories.MOVEMENT) {
    val highTp: Boolean get() = false
    val highTpAmount: Double get() = 0.0
    fun indicateTeleport(x: Double = 0.0, y: Double = 0.0, z: Double = 0.0) {}
}
