package impl

import AbstractState
import Context

// 狀態A
class StateA(mContext: Context) : AbstractState(mContext) {
    override fun handle(value: Int) {
        println("StateA.handle")
        if(value > 10)
            mContext.mState = StateB(mContext)
    }
}