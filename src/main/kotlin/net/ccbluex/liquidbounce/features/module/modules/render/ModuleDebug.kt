package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.misc.DebuggedOwner
import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories

object ModuleDebug : ClientModule("Debug", ModuleCategories.RENDER) {
    open class DebuggedGeometry
    class DebuggedPoint(
        val pos: Any? = null,
        val color: Any? = null,
        val size: Any? = null
    ) : DebuggedGeometry()
    class DebuggedBox(
        val box: Any? = null,
        val color: Any? = null
    ) : DebuggedGeometry()
    class DebuggedLine(
        val from: Any? = null,
        val to: Any? = null,
        val color: Any? = null
    ) : DebuggedGeometry()
    class DebuggedLineSegment(
        val from: Any? = null,
        val to: Any? = null,
        val color: Any? = null
    ) : DebuggedGeometry()
    class DebugCollection<T>(val items: List<T> = emptyList()) : DebuggedGeometry()

    // ModuleDebug.debugParameter(owner, name, value) call style
    fun debugParameter(owner: Any?, name: String, value: Any?) {}
    fun debugGeometry(owner: Any?, name: String, geometry: Any?) {}
}

// Package-level extensions so receivers like parent / PositionFactoryDebug work
fun DebuggedOwner.debugGeometry(name: String, geometry: Any? = null) {}
fun DebuggedOwner.debugGeometry(name: String, block: () -> Any?) {}
fun DebuggedOwner.debugParameter(name: String, value: Any? = null) {}
fun DebuggedOwner.debugParameter(name: String, block: () -> Any?) {}
