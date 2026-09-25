package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.entity.Entity

object ModuleCombineMobs : ClientModule("CombineMobs", ModuleCategories.RENDER) {
    fun shouldCombine(entity: Any?): Boolean = false
    fun trackEntity(entity: Entity?, vararg rest: Any?): Boolean = false
    val groupedEntities: Map<Any, Any> get() = emptyMap()
}
