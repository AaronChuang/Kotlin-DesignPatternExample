package impl

import Builder
import Product

class Builder2Impl:Builder() {
    override fun buildPart1(product: Product) {
        product.addPart("Implement Builder 2  part 1")
    }

    override fun buildPart2(product: Product) {
        product.addPart("Implement Builder 2  part 2")
    }
}