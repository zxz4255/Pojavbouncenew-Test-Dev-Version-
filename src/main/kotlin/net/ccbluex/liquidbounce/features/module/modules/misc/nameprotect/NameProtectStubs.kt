package net.ccbluex.liquidbounce.features.module.modules.misc.nameprotect

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.minecraft.network.chat.Component

object ModuleNameProtect : ClientModule("NameProtect", ModuleCategories.MISC)

fun sanitizeForeignInput(text: String): String = text
fun sanitizeForeignInput(text: Component): Component = text
