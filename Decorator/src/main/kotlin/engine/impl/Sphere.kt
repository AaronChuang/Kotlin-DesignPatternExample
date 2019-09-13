package engine.impl

import shape.AbstractShape

class Sphere : AbstractShape() {
    override fun draw() {
        mRenderEngine.render("Sphere")
    }

    override fun getPolygon(): String {
        return "Sphere多邊型"
    }
}