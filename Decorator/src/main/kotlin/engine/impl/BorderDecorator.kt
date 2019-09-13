package engine.impl

import shape.AbstractShape
import shape.AbstractShapeDecoratror
import shape.IRenderEngine

// 外框裝飾者
class BorderDecorator(mComponent: AbstractShape) :AbstractShapeDecoratror(mComponent) {
    // 外框功能
    private val mBorder = Border()

    override fun setRenderEngine(engine: IRenderEngine){
        super.setRenderEngine(engine)
        mBorder.setRenderEngine(engine)
    }

    override fun draw() {
        // 被裝飾者的功能
        super.draw()
        // 外框功能
        mBorder.drawOnShape(this)
    }
}