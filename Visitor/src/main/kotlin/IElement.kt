// 制訂以Visitor物件當參數的Accept()介面
interface IElement {
    fun accept(visitor:IVisitor)
}