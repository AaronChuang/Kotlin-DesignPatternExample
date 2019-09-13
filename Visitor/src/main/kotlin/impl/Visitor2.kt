package impl

import IVisitor

// 實作功能操作Visitor2
class Visitor2:IVisitor {
    // 可以寫一個通用的函式名稱但以用不同的參數來產生多樣化方法
    override fun visitElement(element: ElementA) {
        println("Visitor2.visitElement(A)")
    }

    override fun visitElement(element: ElementB) {
        println("Visitor2.visitElement(B)")
    }

    override fun visitElementA(element: ElementA) {
        println("Visitor2.visitElementA()")
    }

    override fun visitElementB(element: ElementB) {
        println("Visitor2.visitElementB()")
    }
}