package impl

import ICreator
import IProduct

// 產生ProductB的工廠
class CreatorProductB:ICreator {
    init {
        println("產生工廠:CreatorProductB")
    }

    override fun factoryMethod(): IProduct {
        return ProductB()
    }
}