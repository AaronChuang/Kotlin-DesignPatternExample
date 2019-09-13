package impl

import IComponent

// 定義可被Decorator動態增加權責的物件
class Component: IComponent{
    override fun operator() {
        println("ComponentImpl.operator")
    }
}