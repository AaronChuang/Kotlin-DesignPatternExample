import impl.ObserverImpl1
import impl.ObserverImpl2
import impl.SubjectImpl
import org.junit.jupiter.api.Test

class ObserverTest {
    @Test
    fun unitTest(){
        // 主題
        val subject = SubjectImpl()

        // 加入觀察者
        val observer1 = ObserverImpl1(subject)
        subject.attach(observer1)
        subject.attach(ObserverImpl2(subject))

        // 設定Subject
        subject.mSubjectState = "Subject狀態1"

        // 顯示狀態
        observer1.showState()
    }
}