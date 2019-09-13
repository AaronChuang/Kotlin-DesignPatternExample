package impl

import IVisitor

// 實作功能操作Visitor1
class Visitor1:IVisitor {
    // 可以寫一個通用的函式名稱但以用不同的參數來產生多樣化方法
    override fun visitElement(element: ElementA) {
        println("Visitor1.visitElement(A)")
    }

    override fun visitElement(element: ElementB) {
        println("Visitor1.visitElement(B)")
    }

    override fun visitElementA(element: ElementA) {
        println("Visitor1.visitElementA()")
    }

    override fun visitElementB(element: ElementB) {
        println("Visitor1.visitElementB()")
    }
}