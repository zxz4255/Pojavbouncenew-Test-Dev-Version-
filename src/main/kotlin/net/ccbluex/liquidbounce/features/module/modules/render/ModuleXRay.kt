package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.level.block.Block
import java.util.concurrent.CopyOnWriteArraySet

object ModuleXRay : ClientModule("XRay", ModuleCategories.RENDER) {
    val blocks: MutableSet<Block> = CopyOnWriteArraySet()
    fun applyDefaults() {
        blocks.clear()
    }
}
