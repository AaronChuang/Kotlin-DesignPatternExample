import impl.ClassA
import impl.ClassB
import org.junit.jupiter.api.Test

class TemplateMethodTest {
    @Test
    fun unitTest(){
        var mClass:AbstractClass = ClassA()
        mClass.templateMethod()

        mClass = ClassB()
        mClass.templateMethod()
    }
}