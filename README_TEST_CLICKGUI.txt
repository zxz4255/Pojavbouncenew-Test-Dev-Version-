PojavBounceNew — 精简测试源码（仅 ClickGUI + Test）

已删除几乎全部业务模块源码，仅保留：
  - ModuleClickGui / Liquid / Solstice / Rise / Native ClickGUI
  - ModuleHud / ModuleDebug / ModuleTest
  - 以及少量 STUB（满足其它工具类编译引用，不注册到 ModuleManager）

ModuleManager 只注册 ClickGUI 系 + Test + Hud + Debug。

编译：
  ./gradlew build -x test -x detekt

若仍有 Unresolved reference，把完整报错贴出再补 stub。
