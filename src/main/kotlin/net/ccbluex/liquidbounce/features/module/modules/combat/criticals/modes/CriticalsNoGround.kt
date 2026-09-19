package net.ccbluex.liquidbounce.features.module.modules.combat.criticals.modes

object CriticalsNoGround {
    @JvmField var enabled: Boolean = false
    @JvmStatic fun running(): Boolean = false
    val running: Boolean get() = false
}
