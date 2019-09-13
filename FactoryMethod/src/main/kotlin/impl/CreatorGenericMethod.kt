package impl

import IProduct

// 覆寫factory method，以回傳Product型別之物件
class CreatorGenericMethod {

    init {
        println("產生工廠:CreatorGenericMethod")
    }

    inline fun <reified T : IProduct> factoryMethod(): T{
        return T::class.java.getDeclaredConstructor().newInstance()
    }
}