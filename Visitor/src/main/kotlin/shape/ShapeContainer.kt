package shape

// 形狀容器
class ShapeContainer {
    val mShapes = mutableListOf<AbstractShape>()
    // 新增
    fun addShape(shape:AbstractShape) {
        mShapes.add(shape)
    }

    // 共用的訪問者界面
    fun runVisitor(visitor:AbstractShapeVisitor) {
        mShapes.forEach {
            it.runVisitor(visitor)
        }
    }
}