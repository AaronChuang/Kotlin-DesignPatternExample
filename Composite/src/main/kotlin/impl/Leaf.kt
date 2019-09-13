package impl

import AbstractComponent

// 代表複合結構之終端物件
class Leaf(override var mValue:String?):AbstractComponent() {
    override fun operation() {
        println("Leaf[$mValue]執行operation()")
    }
}