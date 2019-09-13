package shape

// 型狀裝飾者界面
open class AbstractShapeDecoratror(private val mComponent:AbstractShape) : AbstractShape() {
    override fun draw() {
        mComponent.draw()
    }

    override fun getPolygon(): String {
        return mComponent.getPolygon()
    }
}