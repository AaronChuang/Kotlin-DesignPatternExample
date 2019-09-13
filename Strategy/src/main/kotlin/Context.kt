// 擁有Strategy物件的客戶端
class Context {
    // 設定演算法
    var mStrategy : IStrategy? = null

    // 執行目前的演算法
    fun contextInterface(){
        mStrategy?.algorithmInterface()
    }
}