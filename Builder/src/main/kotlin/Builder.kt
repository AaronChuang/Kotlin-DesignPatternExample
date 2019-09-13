// 介面用來生成Product的各零件
abstract class Builder {
    abstract fun buildPart1(product:Product)
    abstract fun buildPart2(product:Product)
}