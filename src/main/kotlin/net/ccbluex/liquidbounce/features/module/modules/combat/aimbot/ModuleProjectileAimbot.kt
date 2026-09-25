package net.ccbluex.liquidbounce.features.module.modules.combat.aimbot

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleProjectileAimbot : ClientModule("ProjectileAimbot", ModuleCategories.COMBAT) {
    fun debugGeometry(name: String, block: () -> Any? = { null }) {}
    fun debugParameter(name: String, block: () -> Any? = { null }) {}
    fun debugParameter(name: String, value: Any?) {}
}
