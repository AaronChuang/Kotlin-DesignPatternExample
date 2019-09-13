package impl

import IComponent

// 持有指向Component的reference，須符合Component的介面
open class Decorator(private val component: IComponent): IComponent{

    override fun operator() {
        component.operator()
    }
}