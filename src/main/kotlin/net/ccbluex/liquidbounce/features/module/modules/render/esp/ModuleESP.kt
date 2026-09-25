package net.ccbluex.liquidbounce.features.module.modules.render.esp

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.ccbluex.liquidbounce.render.engine.type.Color4b
import net.minecraft.world.entity.Entity

object ModuleESP : ClientModule("ESP", ModuleCategories.RENDER) {
    fun getColor(entity: Entity): Color4b = Color4b.WHITE
}
