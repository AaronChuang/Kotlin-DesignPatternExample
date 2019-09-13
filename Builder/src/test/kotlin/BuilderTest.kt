import impl.Builder1Impl
import impl.Builder2Impl
import org.junit.jupiter.api.Test

class BuilderTest {
    @Test
    fun unitTest(){
        // 建立
        val director = Director()
        var product: Product?

        // 使用BuilderA建立
        director.construct(Builder1Impl())
        product = director.getResult()
        product.showProduct()

        // 使用BuilderB建立
        director.construct(Builder2Impl())
        product = director.getResult()
        product.showProduct()
    }

}