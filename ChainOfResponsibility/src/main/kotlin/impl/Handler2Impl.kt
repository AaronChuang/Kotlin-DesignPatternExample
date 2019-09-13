package impl

import Handler

// 處理所負責的訊息2
class Handler2Impl(mNextHandler: Handler) : Handler(mNextHandler) {
    private val mCostCheck = 20

    override fun handleRequest(cost:Int){
        if( cost <= mCostCheck)
            println("Handler2Impl.核準")
        else
            super.handleRequest(cost)
    }
}