package impl

import IStrategy
// 演算法B
class StrategyB:IStrategy {
    override fun algorithmInterface() {
        println("StrategyB.algorithmInterface")
    }
}