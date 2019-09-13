// 利用Builder介面來建構物件
class Director {
    private lateinit var mProduct:Product

    // 建立
    fun construct(builder: Builder){
        mProduct = Product()
        builder.buildPart1(mProduct)
        builder.buildPart2(mProduct)
    }

    // 取得成品
    fun getResult():Product{
        return mProduct
    }
}