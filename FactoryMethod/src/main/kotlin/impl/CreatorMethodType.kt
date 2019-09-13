package impl

import ICreatorMethodType
import IProduct

// 覆寫factory method，以回傳Product型別之物件
class CreatorMethodType:ICreatorMethodType {
    init {
        println("產生工廠:CreatorMethodType")
    }
    override fun factoryMethod(type: Int): IProduct? {
        when (type) {
            1 -> return ProductA()
            2 -> return ProductB()
        }
        println("Type[$type]無法產生物件")
        return null
    }
}