import impl.StateA
import org.junit.jupiter.api.Test

class StateTest {

    @Test
    fun unitTest(){
        val context = Context()
        context.mState = StateA(context)
        context.request(5)
        context.request(15)
        context.request(25)
        context.request(35)
    }
}