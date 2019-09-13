package impl

import IStrategy
// 演算法A
class StrategyA:IStrategy {
    override fun algorithmInterface() {
        println("StrategyA.algorithmInterface")
    }
}