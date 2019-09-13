package engine.impl

import shape.IRenderEngine

// OpenGL引擎
class OpenGL:IRenderEngine {
    override fun render(name: String) {
        GLRender(name)
    }

    fun GLRender(name:String){
        println("OpenGL:$name")
    }
}