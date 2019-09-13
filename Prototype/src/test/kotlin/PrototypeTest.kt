import impl.PrototypeImpl
import org.junit.jupiter.api.Test

class PrototypeTest {

    @Test
    fun unitTest(){
        // 原始物件
        val obj = PrototypeImpl()
        obj.name = "Object1"

        // 複製物件
        val cloneObj = obj.clone() as PrototypeImpl

        // 顯示
        println("原始物件:${obj.name}")
        println("複製物件:${cloneObj.name}")
    }
}