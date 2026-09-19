package net.ccbluex.liquidbounce.features.module.modules.combat

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.item.ItemStack

object ModuleSwordBlock : ClientModule("SwordBlock", ModuleCategories.COMBAT) {
    fun hideShieldSlot(stack: ItemStack?): Boolean = false
    fun shouldHideOffhand(stack: ItemStack? = null): Boolean = false
}
