import impl.ColleagueImpl1
import impl.ColleagueImpl2
import impl.MediatorImpl
import org.junit.jupiter.api.Test

class MediatorTest {

    @Test
    fun unitTest(){
        // 產生仲介者
        val mediator = MediatorImpl()

        // 產生兩個Colleague
        val colleague1 = ColleagueImpl1(mediator)
        val colleague2 = ColleagueImpl2(mediator)

        // 設定給仲介者
        mediator.setColleague1(colleague1)
        mediator.setColleague2(colleague2)

        // 執行
        colleague1.action()
        colleague2.action()
    }
}