package net.ccbluex.liquidbounce.features.module.modules.misc

import net.ccbluex.liquidbounce.event.events.TransferOrigin
import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.network.protocol.Packet

object ModulePacketLogger : ClientModule("PacketLogger", ModuleCategories.MISC) {
    fun onPacket(origin: TransferOrigin, packet: Packet<*>) {}
    fun onPacket(packet: Packet<*>, outbound: Boolean = true) {}
}
