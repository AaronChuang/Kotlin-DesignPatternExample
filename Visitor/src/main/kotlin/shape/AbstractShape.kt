package shape

import engine.RenderEngine

// 形狀
abstract class AbstractShape {
    protected var mRenderEngine: RenderEngine? = null    // 使用的繪圖引擎
    protected var mPosition = 0    // 顯示位置
    protected var mScale = 0        // 大小(縮放)


    abstract fun draw()         // 繪出
    abstract fun getVolume(): Float  // 取得體積
    abstract fun getVertexCount(): Int  // 取得頂點數
    abstract fun runVisitor(visitor: AbstractShapeVisitor)
}