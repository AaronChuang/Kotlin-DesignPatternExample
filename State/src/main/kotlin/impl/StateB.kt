package impl

import AbstractState
import Context

// 狀態B
class StateB(mContext: Context) : AbstractState(mContext) {
    override fun handle(value: Int) {
        println("StateB.handle")
        if(value > 20)
            mContext.mState = StateC(mContext)
    }
}