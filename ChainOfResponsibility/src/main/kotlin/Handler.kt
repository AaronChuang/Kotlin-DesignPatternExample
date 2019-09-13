abstract class Handler(var mNextHandler: Handler?) {

    open fun handleRequest(cost:Int) {
        mNextHandler?.handleRequest(cost)
    }
}