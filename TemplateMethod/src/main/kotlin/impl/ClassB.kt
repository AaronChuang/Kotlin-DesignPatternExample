package impl

import AbstractClass
// 實作演算法各步驟
class ClassB: AbstractClass() {
    override fun primitiveOperation1() {
        println("ClassB.primitiveOperation1")
    }

    override fun primitiveOperation2() {
        println("ClassB.primitiveOperation2")
    }
}