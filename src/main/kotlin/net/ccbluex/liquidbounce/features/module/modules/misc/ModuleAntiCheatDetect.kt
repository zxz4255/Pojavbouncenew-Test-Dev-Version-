package net.ccbluex.liquidbounce.features.module.modules.misc
import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
object ModuleAntiCheatDetect : ClientModule("AntiCheatDetect", ModuleCategories.MISC) {
    fun completed(): Boolean = true
}
