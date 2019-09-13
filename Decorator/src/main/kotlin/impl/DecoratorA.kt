package impl

import IComponent

// 增加額外的權責/功能
class DecoratorA(component: IComponent): Decorator(component){

    override fun operator() {
        super.operator()
        addBehavior()
    }

    private fun addBehavior(){
        println("DecoratorA.addBehavior")
    }
}