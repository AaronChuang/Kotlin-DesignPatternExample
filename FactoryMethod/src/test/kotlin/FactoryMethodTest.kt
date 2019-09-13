import impl.*
import org.junit.jupiter.api.Test

class FactoryMethodTest {

    @Test
    fun unitTest(){
        // 產品
        var product:IProduct?

        // 工廠界面
        var creator:ICreator

        // 設定為負責ProduceA的工廠
        creator = CreatorProductA()
        product = creator.factoryMethod()

        // 設定為負責ProduceB的工廠
        creator = CreatorProductB()
        product = creator.factoryMethod()

        // 工廠界面
        val creatorMethodType = CreatorMethodType()

        // 取得兩個產品
        product = creatorMethodType.factoryMethod(1)
        product = creatorMethodType.factoryMethod(2)

        // 使用Generic Method
        val creatorGM = CreatorGenericMethod()
        product = creatorGM.factoryMethod<ProductA>()
        product = creatorGM.factoryMethod<ProductB>()

        // 使用Generic Class
        // 負責ProduceA的工廠
        val creatorProductA = CreatorGenericClass(ProductA::class.java)
        product = creatorProductA.factoryMethod()

        // 負責ProduceA的工廠
        val creatorProductB = CreatorGenericClass(ProductB::class.java)
        product = creatorProductB.factoryMethod()
    }
}