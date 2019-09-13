package impl

import ICreator
import IProduct

// 產生ProductA的工廠
class CreatorProductA:ICreator {
    init {
        println("產生工廠:CreatorProductA")
    }

    override fun factoryMethod(): IProduct {
        return ProductA()
    }
}