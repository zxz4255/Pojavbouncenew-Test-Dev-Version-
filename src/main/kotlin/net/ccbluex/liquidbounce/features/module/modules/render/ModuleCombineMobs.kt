package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.entity.Entity

object ModuleCombineMobs : ClientModule("CombineMobs", ModuleCategories.RENDER) {
    fun trackEntity(entity: Entity, combine: Boolean = false): Boolean = false
}
