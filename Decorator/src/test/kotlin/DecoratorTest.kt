import impl.Component
import impl.DecoratorA
import impl.DecoratorB
import org.junit.jupiter.api.Test
import engine.impl.BorderDecorator
import engine.impl.Sphere
import engine.impl.OpenGL


class DecoratorTest {

    @Test
    fun unitTest(){
        // 物件
        val component = Component()

        // 增加Decorator
        val decoratorA = DecoratorA(component)
        decoratorA.operator()

        val decoratorB = DecoratorB(component)
        decoratorB.operator()

        // 再增加一層
        val decoratorB2 = DecoratorB(decoratorA)
        decoratorB2.operator()
    }

    @Test
    fun unitTest2(){
        val openGL = OpenGL()

        // 圓型
        val sphere = Sphere()
        sphere.setRenderEngine(openGL)

        //在圖型加外框
        val sphereWithBorder = BorderDecorator(sphere)
        sphereWithBorder.setRenderEngine(openGL)
        sphereWithBorder.draw()

    }
}