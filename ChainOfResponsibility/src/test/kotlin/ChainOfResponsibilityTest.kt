import impl.Handler1Impl
import impl.Handler2Impl
import impl.Handler3Impl
import org.junit.jupiter.api.Test

class ChainOfResponsibilityTest {
    @Test
    fun unitTest(){
        // 建立Cost驗証的連接方式
        val handler3 = Handler3Impl(null)
        val handler2 = Handler2Impl(handler3)
        val handler1 = Handler1Impl(handler2)

        // 確認
        handler1.handleRequest(10)
        handler1.handleRequest(15)
        handler1.handleRequest(20)
        handler1.handleRequest(30)
        handler1.handleRequest(100)
    }
}