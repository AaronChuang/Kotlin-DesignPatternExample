class Originator {
    private var mState:String = ""

    fun setInfo(state:String){
        mState = state
    }

    fun showInfo(){
        println("Originator State: $mState")
    }
    // 產生要儲存的記錄
    fun createMemento(): Memento {
        val newMemento = Memento()
        newMemento.state = mState
        return newMemento
    }

    // 設定要回復的記錄
    fun setMemento(mem: Memento) {
        mState = mem.state
    }
}