package shape.impl

import engine.RenderEngine
import shape.AbstractShape
import shape.AbstractShapeVisitor

// 圖柱體
class Cylinder :AbstractShape {
    constructor(mRenderEngine: RenderEngine) {
        this.mRenderEngine = mRenderEngine
        super.mRenderEngine = mRenderEngine
    }

    override fun draw() {
        mRenderEngine?.render("Cylinder")
    }

    override fun getVolume(): Float {
        return 0f
    }

    override fun getVertexCount(): Int {
        return 0
    }

    override fun runVisitor(visitor: AbstractShapeVisitor) {
        visitor.visitCylinder(this)
    }


}