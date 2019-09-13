package shape.impl

import shape.AbstractShapeVisitor

// 計數
class VertexCountVisitor:AbstractShapeVisitor() {
    var mCount = 0
        private set
    // Sphere類別呼叫用
    override fun visitSphere(sphere: Sphere) {
        mCount += sphere.getVertexCount()
    }
    // Cube類別呼叫用
    override fun visitCube(cube: Cube) {
        mCount += cube.getVertexCount()
    }
    // Cylinder類別呼叫用
    override fun visitCylinder(cylinder: Cylinder) {
        mCount += cylinder.getVertexCount()
    }
}