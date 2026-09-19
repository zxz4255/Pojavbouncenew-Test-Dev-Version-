package net.ccbluex.liquidbounce.features.module.modules.world

import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import java.util.concurrent.CopyOnWriteArraySet

object ModuleAutoDisable : ClientModule("AutoDisable", ModuleCategories.WORLD) {
    val modules: MutableSet<ClientModule> = CopyOnWriteArraySet()

    fun clear() {
        modules.clear()
    }

    fun add(module: ClientModule): Boolean = modules.add(module)

    fun remove(module: ClientModule): Boolean = modules.remove(module)
}
