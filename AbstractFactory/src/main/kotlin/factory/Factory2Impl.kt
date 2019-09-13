package factory

import product.AbstractProductA
import product.AbstractProductB
import product.ProductA2
import product.ProductB2

// 實作出可建構具象成品物件的操作2
class Factory2Impl:AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        return ProductA2()
    }

    override fun createProductB(): AbstractProductB {
        return ProductB2()
    }
}