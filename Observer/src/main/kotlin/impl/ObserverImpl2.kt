package impl

import IObserver
// 實作的Observer2
class ObserverImpl2(val mSubjectImpl: SubjectImpl):IObserver {
    // 通知Subject更新
    override fun update() {
        println("ObserverImpl2.update")
        // 取得Subject狀態
        println("ObserverImpl2.Subject目前的主題:${mSubjectImpl.mSubjectState}")
    }

}