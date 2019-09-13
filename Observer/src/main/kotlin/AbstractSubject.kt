// 主題介面
abstract class AbstractSubject {
    val mObservers = mutableListOf<IObserver>()

    // 加入觀察者
    fun attach(observer:IObserver) {
        mObservers.add(observer)
    }

    // 移除觀察者
    fun detach(observer:IObserver) {
        mObservers.remove(observer)
    }

    // 通知所有觀察者
    fun notifyAllObservers(){
        mObservers.forEach {
            it.update()
        }
    }
}