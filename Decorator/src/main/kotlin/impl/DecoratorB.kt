package impl

import IComponent

// 增加額外的權責/功能
class DecoratorB(component: IComponent): Decorator(component){

    override fun operator() {
        addBehavior()
        super.operator()
    }

    private fun addBehavior(){
        println("DecoratorB.addBehavior")
    }
}