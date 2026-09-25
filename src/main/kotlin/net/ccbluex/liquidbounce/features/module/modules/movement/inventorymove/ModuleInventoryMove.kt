package net.ccbluex.liquidbounce.features.module.modules.movement.inventorymove
import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
object ModuleInventoryMove : ClientModule("InventoryMove", ModuleCategories.MOVEMENT) {
    fun shouldHandleInputs(vararg args: Any?): Boolean = false
}
