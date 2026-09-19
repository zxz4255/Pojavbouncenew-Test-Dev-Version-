package net.ccbluex.liquidbounce.features.module.modules.player.nofall.modes

object NoFallNoGround {
    @JvmField var enabled: Boolean = false
    @JvmStatic fun running(): Boolean = false
    val running: Boolean get() = false
}
