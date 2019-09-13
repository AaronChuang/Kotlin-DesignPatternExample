package impl

import IPrototype

class PrototypeImpl:IPrototype {
    var name:String = ""
    override fun clone(): Any {
        val obj = PrototypeImpl()
        obj.name = this.name
        return obj
    }
}