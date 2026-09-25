package net.ccbluex.liquidbounce.features.module.modules.misc
import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
object ModulePacketLogger : ClientModule("PacketLogger", ModuleCategories.MISC) {
    fun onPacket(packet: Any?, vararg rest: Any?) {}
}
