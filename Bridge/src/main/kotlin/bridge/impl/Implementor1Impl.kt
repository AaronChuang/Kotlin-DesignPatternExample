package bridge.impl

import bridge.Implementor

// 實作Implementor所訂之介面
class Implementor1Impl: Implementor() {
    override fun operationImpl() {
        println("執行Implementor1Impl.operationImpl")
    }
}