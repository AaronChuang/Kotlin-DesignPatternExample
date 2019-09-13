package shape.impl

import engine.RenderEngine
import shape.AbstractShape
import shape.AbstractShapeVisitor

// 圓球
class Sphere :AbstractShape {
    constructor(mRenderEngine: RenderEngine) {
        this.mRenderEngine = mRenderEngine
        super.mRenderEngine = mRenderEngine
    }

    override fun draw() {
        mRenderEngine?.render("Sphere")
    }

    override fun getVolume(): Float {
        return 0f
    }

    override fun getVertexCount(): Int {
        return 0
    }

    override fun runVisitor(visitor: AbstractShapeVisitor) {
        visitor.visitSphere(this)
    }


}