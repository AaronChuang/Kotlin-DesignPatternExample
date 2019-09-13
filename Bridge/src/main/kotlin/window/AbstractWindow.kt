package window

// 抽象體的介面,維護指向Implementor的物件
abstract class AbstractWindow {
    private var mImpl: AbstractWindowImpl? = null
    // 顯示
    abstract fun show()

    fun setImplementor(impl:AbstractWindowImpl){
        mImpl = impl
    }

    // 畫字
    protected fun drawText(text: String) {
        mImpl?.devDrawText(text)
    }

    // 畫方塊
    protected fun drawRect(text: String) {
        mImpl?.devDrawLine( "$text Top Line")
        mImpl?.devDrawLine("$text Right Line")
        mImpl?.devDrawLine("$text Bottom Line")
        mImpl?.devDrawLine("$text Left Line")
    }

}