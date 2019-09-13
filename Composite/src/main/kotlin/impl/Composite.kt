package impl

import AbstractComponent

class Composite(override var mValue:String?):AbstractComponent() {
    private val mChildren = mutableListOf<AbstractComponent>()
    // 一般操作
    override fun operation() {
        println("Composite[$mValue]")
        mChildren.forEach {
            it.operation()
        }
    }

    // 加入節點
    override fun add(component:AbstractComponent) {
        mChildren.add(component)
    }

    // 移除節點
    override fun remove(component:AbstractComponent) {
        mChildren.remove(component)
    }

    // 取得子節點
    override fun getChild(index:Int):AbstractComponent {
        return mChildren[index]
    }
}