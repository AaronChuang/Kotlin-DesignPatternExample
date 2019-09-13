package impl

import IProduct

/// 宣告Generic factory類別
class CreatorGenericClass<T : IProduct>(private val klass: Class<T>){

    init {
        println("產生工廠:CreatorGenericClass")
    }

    fun factoryMethod(): IProduct {
        return klass.getDeclaredConstructor().newInstance()
    }
}