package shape.impl

import shape.AbstractShapeVisitor

// 只計算圓型體積
class SphereVolumeVisitor:AbstractShapeVisitor() {
    var mVolume = 0.0f
    // Sphere類別呼叫用
    override fun visitSphere(sphere:Sphere) {
        mVolume += sphere.getVolume()
    }
}