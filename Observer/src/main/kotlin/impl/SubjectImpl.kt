package impl

import AbstractSubject

// 主題實作
class SubjectImpl: AbstractSubject() {
    var mSubjectState:String = ""
        set(value) {
            field = value
            notifyAllObservers()
        }
}