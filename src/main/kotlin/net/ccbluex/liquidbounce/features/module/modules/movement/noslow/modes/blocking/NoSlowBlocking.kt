package net.ccbluex.liquidbounce.features.module.modules.movement.noslow.modes.blocking

object NoSlowBlocking {
    @JvmField var enabled: Boolean = false
    @JvmStatic fun running(): Boolean = false
    val running: Boolean get() = false
}
