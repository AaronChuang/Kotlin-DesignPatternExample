import org.junit.jupiter.api.Test

class FlyweightTest {
    @Test
    fun unitTest(){
        // 元件工廠
        val factory = FlyweightFactor()

        // 產生共用元件
        factory.getFlyweight("1", "共用元件1")
        factory.getFlyweight("2", "共用元件1")
        factory.getFlyweight("3", "共用元件1")

        // 取得一個共用元件
        val flyweight = factory.getFlyweight("1", "")
        flyweight.operator()

        // 產生不共用的元件
        val unshared1 = factory.getUnsharedFlyweight("不共用的資訊1")
        unshared1.operator()

        // 設定共用元件
        unshared1.setFlyweight(flyweight)

        // 產生不共用的元件2,並指定使用共用元件１
        val unshared2 = factory.getUnsharedFlyweight("1", "", "不共用的資訊2")

        // 同時顯示
        unshared1.operator()
        unshared2.operator()

    }
}