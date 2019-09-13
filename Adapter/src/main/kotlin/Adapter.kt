// 將Adaptee轉換成Target介面
class Adapter:Target(){
    private val mAdaptee = Adaptee()

    override fun request() {
        mAdaptee.request()
    }
}