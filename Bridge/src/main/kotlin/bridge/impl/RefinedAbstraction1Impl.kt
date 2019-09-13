package bridge.impl

import bridge.Abstraction

// 擴充Abstraction所訂之介面
class RefinedAbstraction1Impl:Abstraction() {
    override fun operation(){
        super.operation()
        println("物件RefinedAbstraction1")
    }
}