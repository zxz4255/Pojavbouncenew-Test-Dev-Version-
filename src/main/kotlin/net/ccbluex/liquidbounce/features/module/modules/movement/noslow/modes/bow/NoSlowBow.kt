package net.ccbluex.liquidbounce.features.module.modules.movement.noslow.modes.bow

object NoSlowBow {
    @JvmField var enabled: Boolean = false
    @JvmStatic fun running(): Boolean = false
    val running: Boolean get() = false
}
