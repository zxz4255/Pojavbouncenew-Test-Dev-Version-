package net.ccbluex.liquidbounce.features.module.modules.misc.betterchat

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleBetterChat : ClientModule("BetterChat", ModuleCategories.MISC) {
    var antiChatClearPaused: Boolean = false
}
