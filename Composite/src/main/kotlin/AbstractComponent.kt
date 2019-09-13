// 複合體內含物件之介面
abstract class AbstractComponent {
    protected open var mValue:String? = null
    abstract fun operation()	// 一般操作
    // 加入節點
    open fun add(component:AbstractComponent) {
        println("子類別沒實作")
    }
    // 移除節點
    open fun remove(component:AbstractComponent) {
        println("子類別沒實作")
    }
    // 取得子節點
    open fun getChild(index:Int):AbstractComponent? {
        println("子類別沒實作")
        return null
    }
}