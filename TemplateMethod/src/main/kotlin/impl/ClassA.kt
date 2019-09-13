package impl

import AbstractClass
// 實作演算法各步驟
class ClassA: AbstractClass() {
    override fun primitiveOperation1() {
        println("ClassA.primitiveOperation1")
    }

    override fun primitiveOperation2() {
        println("ClassA.primitiveOperation2")
    }
}