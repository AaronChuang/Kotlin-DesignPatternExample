package impl

import ISubject
// 定義Proxy所代表的真正物件
class RealSubject:ISubject {
    override fun request() {
        println("RealSubject.request")
    }
}