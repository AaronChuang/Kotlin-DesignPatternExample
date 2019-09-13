// 不共用的元件(可以不必繼承)
class UnsharedFlyweight(private val mUnsharedContent:String) {
    var mFlyweight: AbstractFlyweight? = null // 共享的元件
    // 設定共享的元件
    fun setFlyweight(flyweight: AbstractFlyweight) {
        mFlyweight = flyweight
    }

    fun operator() {
        var msg = "UnsharedFlyweight.Content[$mUnsharedContent]"
        if (mFlyweight != null)
            msg += "包含了：${mFlyweight!!.mContent}"
        println(msg)
    }
}