package impl

import IObserver
// 實作的Observer1
class ObserverImpl1(val mSubjectImpl: SubjectImpl):IObserver {
    var mObjectState:String = ""

    // 通知Subject更新
    override fun update() {
        println("ObserverImpl1.update")
        mObjectState = mSubjectImpl.mSubjectState
    }

    fun showState(){
        println("ObserverImpl1:Subject目前的主題:$mObjectState")
    }
}