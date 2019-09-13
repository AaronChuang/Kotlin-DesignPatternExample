package impl

import IElement
import IVisitor

// 元素B
class ElementB:IElement {
    override fun accept(visitor: IVisitor) {
        visitor.visitElement(this)
        visitor.visitElementB(this)
    }

    fun operationB(){
        println("ElementB.operationB")
    }
}