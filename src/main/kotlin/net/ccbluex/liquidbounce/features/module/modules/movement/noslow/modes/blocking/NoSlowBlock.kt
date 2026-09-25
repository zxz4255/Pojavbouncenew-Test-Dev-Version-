package net.ccbluex.liquidbounce.features.module.modules.movement.noslow.modes.blocking
import net.ccbluex.liquidbounce.utils.client.mc
import net.minecraft.client.player.LocalPlayer
object NoSlowBlock {
    // callers use NoSlowBlock.player.xxx - provide mc.player or throw
    val player: LocalPlayer
        get() = mc.player ?: error("No player")
}
