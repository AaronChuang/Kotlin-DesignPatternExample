// 可以被共用的Flyweight介面
abstract class AbstractFlyweight(/*顯示的內容*/val mContent:String) {
    abstract fun operator()
}