import impl.StrategyA
import impl.StrategyB
import impl.StrategyC
import org.junit.jupiter.api.Test

class StrategyTest {
    @Test
    fun unitTest(){
        val context = Context()

        // 設定演算法
        context.mStrategy = StrategyA()
        context.contextInterface()

        context.mStrategy = StrategyB()
        context.contextInterface()

        context.mStrategy = StrategyC()
        context.contextInterface()
    }
}