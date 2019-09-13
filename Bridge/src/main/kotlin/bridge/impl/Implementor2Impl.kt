package bridge.impl

import bridge.Implementor

// 實作Implementor所訂之介面
class Implementor2Impl: Implementor() {
    override fun operationImpl() {
        println("執行Implementor2Impl.operationImpl")
    }
}