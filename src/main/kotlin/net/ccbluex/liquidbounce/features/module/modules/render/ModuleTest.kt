package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.event.events.GameTickEvent
import net.ccbluex.liquidbounce.event.handler
import net.ccbluex.liquidbounce.features.module.ClientModule
import net.ccbluex.liquidbounce.features.module.ModuleCategories
import net.ccbluex.liquidbounce.utils.client.chat

/**
 * 精简测试构建专用模块：验证 ClientModule / 配置 / 事件 API 仍可用。
 */
object ModuleTest : ClientModule(
    "Test",
    ModuleCategories.RENDER,
    aliases = listOf("ApiTest", "SmokeTest"),
) {

    private val message by text("Message", "LiquidBounce API OK")
    private val interval by int("Chat Interval Ticks", 100, 20..400)
    private val notify by boolean("Chat Notify", true)

    private var ticks = 0

    override fun onEnabled() {
        ticks = 0
        if (notify) chat("§a[Test] §fenabled — $message")
    }

    override fun onDisabled() {
        if (notify) chat("§c[Test] §fdisabled")
    }

    @Suppress("unused")
    private val tickHandler = handler<GameTickEvent> {
        if (!notify) return@handler
        ticks++
        if (ticks >= interval) {
            ticks = 0
            chat("§7[Test] §f$message")
        }
    }
}
