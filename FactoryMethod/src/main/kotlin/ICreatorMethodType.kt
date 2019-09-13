// 宣告factory method，它會依參數Type的提示回傳對應Product類別物件
interface ICreatorMethodType {
    fun factoryMethod(type:Int):IProduct?
}