package net.ccbluex.liquidbounce.features.module.modules.misc.nameprotect

import net.minecraft.network.chat.Component

fun String.sanitizeForeignInput(): String = this
fun CharSequence.sanitizeForeignInput(): String = this.toString()
fun Component.sanitizeForeignInput(): Component = this
