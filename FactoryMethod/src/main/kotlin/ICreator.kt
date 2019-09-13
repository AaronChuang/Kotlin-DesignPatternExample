// 宣告factory , 子類別會回傳對應的Product型別之物件
interface ICreator {
    fun factoryMethod():IProduct
}