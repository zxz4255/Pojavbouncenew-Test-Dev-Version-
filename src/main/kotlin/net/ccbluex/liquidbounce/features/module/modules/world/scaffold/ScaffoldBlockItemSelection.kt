package net.ccbluex.liquidbounce.features.module.modules.world.scaffold

import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.block.state.BlockState

object ScaffoldBlockItemSelection {
    fun isBlockUnfavourable(stack: ItemStack): Boolean = false
    fun isBlockUnfavourable(state: BlockState): Boolean = false
}
