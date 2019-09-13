package factory

import product.AbstractProductA
import product.AbstractProductB
import product.ProductA1
import product.ProductB1

// 實作出可建構具象成品物件的操作1
class Factory1Impl: AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        return ProductA1()
    }

    override fun createProductB(): AbstractProductB {
        return ProductB1()
    }
}