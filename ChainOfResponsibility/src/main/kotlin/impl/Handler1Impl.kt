package impl

import Handler

// 處理所負責的訊息1
class Handler1Impl(mNextHandler: Handler) : Handler(mNextHandler) {
    private val mCostCheck = 10

    override fun handleRequest(cost:Int){
        if( cost <= mCostCheck)
            println("Handler1Impl.核準")
        else
            super.handleRequest(cost)
    }
}