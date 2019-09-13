import org.junit.jupiter.api.Test

class SingletonTest {

    // 單例模式測試方法
    @Test
    fun unitTest(){
        Singleton.instance?.name = "Hello"
        Singleton.instance?.name = "World"
        println(Singleton.instance?.name)

//        val tempSingleton = Singleton() // fail!
    }

    // 有計數功能類別的測試方法
    @Test
    fun unitTest2(){
        // 有計數功能的類別
        val obj1 = ClassWithCounter()
        obj1.operator()

        val obj2 = ClassWithCounter()
        obj2.operator()

        obj1.operator()
    }
}