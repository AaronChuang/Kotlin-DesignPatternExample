// 持有目前的狀態,並將有關的訊息傳給狀態
class Context {
    var mState:AbstractState? = null
        set(value) {
            println("Context.setState:$value")
            field = value
        }
    fun request(value:Int){
        mState?.handle(value)
    }
}
