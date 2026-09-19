package net.ccbluex.liquidbounce.features.module.modules.misc.nameprotect

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.network.chat.Component

object ModuleNameProtect : ClientModule("NameProtect", ModuleCategories.MISC) {
    fun replace(original: String): String = original
    fun replace(original: Component): Component = original
}

fun Component.sanitizeForeignInput(): Component = this
fun String.sanitizeForeignInput(): String = this
