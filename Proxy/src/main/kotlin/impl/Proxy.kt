package impl

import ISubject
// 持有指向RealSubject物件的reference以便存取真正的物件
class Proxy:ISubject {
    val mRealSubject = RealSubject()
    // 權限控制
    var mConnectRemote = false

    override fun request() {
        // 依目前狀態決定是否存取RealSubject
        if(mConnectRemote)
            mRealSubject.request()
        else
            println("Proxy.request")
    }
}