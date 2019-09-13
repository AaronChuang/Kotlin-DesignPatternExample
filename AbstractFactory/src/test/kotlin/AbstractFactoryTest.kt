
import factory.AbstractFactory
import factory.Factory1Impl
import factory.Factory2Impl
import org.junit.jupiter.api.Test

class AbstractFactoryTest {

    @Test
    fun unitTest(){
        var factory: AbstractFactory?

        // 工廠1
        factory = Factory1Impl()
        // 產生兩個產品
        factory.createProductA()
        factory.createProductB()

        // 工廠2
        factory = Factory2Impl()
        // 產生兩個產品
        factory.createProductA()
        factory.createProductB()
    }
}