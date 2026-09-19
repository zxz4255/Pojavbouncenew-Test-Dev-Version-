package net.ccbluex.liquidbounce.features.module.modules.misc

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.world.entity.player.Player
import java.util.UUID

object ModuleInventoryTracker : ClientModule("InventoryTracker", ModuleCategories.MISC) {
    val playerMap: Map<UUID, Player> = emptyMap()
}
