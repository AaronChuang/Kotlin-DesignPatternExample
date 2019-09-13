package shape.impl

import shape.AbstractShapeVisitor

// 繪圖
class DrawVisitor: AbstractShapeVisitor() {
    // Sphere類別呼叫用
    override fun visitSphere(sphere:Sphere) {
        sphere.draw()
    }
    // Cube類別呼叫用
    override fun visitCube(cube:Cube) {
        cube.draw()
    }
    // Cylinder類別呼叫用
    override fun visitCylinder(cylinder:Cylinder) {
        cylinder.draw()
    }
}