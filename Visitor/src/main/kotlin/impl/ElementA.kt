package impl

import IElement
import IVisitor

// 元素A
class ElementA:IElement {
    override fun accept(visitor: IVisitor) {
        visitor.visitElement(this)
        visitor.visitElementA(this)
    }

    fun operationA(){
        println("ElementA.operationA")
    }
}