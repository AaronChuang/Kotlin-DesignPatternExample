package engine.impl

import shape.AbstractAdditional
import shape.AbstractShape

// 外框
class Border:AbstractAdditional() {
    override fun drawOnShape(shape: AbstractShape) {
        mRenderEngine.render("Draw Border On ${shape.getPolygon()}")
    }

}