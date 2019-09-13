import impl.Command1Impl
import impl.Command2Impl
import org.junit.jupiter.api.Test

class CommandTest {
    @Test
    fun unitTest(){
        val invoker = Invoker()

        var command: Command?
        // 命令與執行結合
        command = Command1Impl(Receiver1(), "世界你好！")
        invoker.addCommand(command)
        command = Command2Impl(Receiver2(), 123)
        invoker.addCommand(command)

        // 執行
        invoker.executeCommand()

    }
}