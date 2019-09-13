package shape

import shape.impl.Cube
import shape.impl.Cylinder
import shape.impl.Sphere

// 訪問者界面
abstract class AbstractShapeVisitor {
    // Sphere類別呼叫用
    open fun visitSphere(sphere: Sphere){}
    // Cube類別呼叫用
    open fun visitCube(cube: Cube){}
    // Cylinder類別呼叫用
    open fun visitCylinder(cylinder: Cylinder){}
}