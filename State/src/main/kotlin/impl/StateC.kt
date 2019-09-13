package impl

import AbstractState
import Context

// 狀態C
class StateC(mContext: Context) : AbstractState(mContext) {
    override fun handle(value: Int) {
        println("StateC.handle")
        if(value > 30)
            mContext.mState = StateA(mContext)
    }
}