import impl.ElementA
import impl.ElementB

// 固定的元素, 定義給Visitor存取的介面
interface IVisitor {
    // 可以寫一個通用的函式名稱但以用不同的參數來產生多樣化方法
    fun visitElement(element: ElementA)
    fun visitElement(element: ElementB)

    // 或可以針對Element的子元件做不同的執行動作
    fun visitElementA(element: ElementA)
    fun visitElementB(element: ElementB)

}