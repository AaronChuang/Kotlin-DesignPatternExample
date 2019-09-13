// 有計數功能的類別
class ClassWithCounter {
    companion object {
        var mObjCounter = 0
    }
    var isEnable = false
    init {
        mObjCounter++
        isEnable = mObjCounter == 1
        if (!isEnable)
            println("目前物件數[$mObjCounter]超過1個!!")
    }

    fun operator() {
        if (!isEnable)
            return
        println("可以執行")
    }
}