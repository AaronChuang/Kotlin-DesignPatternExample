package impl

import Handler

// 處理所負責的訊息3
class Handler3Impl(mNextHandler: Handler?) : Handler(mNextHandler) {

    override fun handleRequest(cost:Int){
        println("Handler3Impl.核準")
    }
}