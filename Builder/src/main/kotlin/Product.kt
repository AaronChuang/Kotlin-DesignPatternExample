// 欲產生的複雜物件
class Product {
    private val mPart = mutableListOf<String>()

    fun addPart(part:String) {
        mPart.add(part)
    }

    fun showProduct(){
        println("ShowProduct Functions:")
        mPart.forEach{
            println(it)
        }
    }
}