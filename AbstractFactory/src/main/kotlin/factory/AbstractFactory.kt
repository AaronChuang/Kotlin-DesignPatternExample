package factory

import product.AbstractProductA
import product.AbstractProductB

//  可生成各抽象成品物件的操作
abstract class AbstractFactory {
    abstract fun createProductA(): AbstractProductA
    abstract fun createProductB(): AbstractProductB
}
