package bridge

// 抽象體的介面,維護指向Implementor的物件
abstract class Abstraction {
    private var mImpl: Implementor? = null

    fun setImplementor(impl:Implementor){
        mImpl = impl
    }

    open fun operation(){
        mImpl?.operationImpl()
    }
}