// 保管所有的Memento
class Caretaker {
    val mMementos = mutableMapOf<String, Memento>()

    // 增加
    fun addMemento(version: String, memento: Memento) {
        mMementos[version] = memento
    }

    // 取回
    fun getMemento(version: String): Memento {
        return mMementos[version]!!
    }
}