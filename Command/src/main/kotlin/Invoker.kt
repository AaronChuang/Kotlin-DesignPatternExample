// 命令管理者
class Invoker {
    private val mCommands = mutableListOf<Command>()

    // 加入命令
    fun addCommand(command: Command) {
        mCommands.add(command)
    }

    // 執行命令
    fun executeCommand() {
        // 執行
        mCommands.forEach {
            it.excute()
        }
        // 清空
        mCommands.clear()
    }
}