package impl

import AbstractFlyweight

// 共用的元件
class FlyweightImpl(mContent: String) : AbstractFlyweight(mContent) {
    override fun operator() {
        println("FlyweightImpl.content[$mContent]")
    }
}