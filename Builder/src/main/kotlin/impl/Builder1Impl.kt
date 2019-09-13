package impl

import Builder
import Product

class Builder1Impl:Builder() {
    override fun buildPart1(product: Product) {
        product.addPart("Implement Builder 1  part 1")
    }

    override fun buildPart2(product: Product) {
        product.addPart("Implement Builder 1  part 2")
    }
}