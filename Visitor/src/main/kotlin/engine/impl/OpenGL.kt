package engine.impl

import engine.RenderEngine

// OpenGL引擎
class OpenGL: RenderEngine {
    override fun render(name: String) {
        GLRender(name)
    }

    override fun text(text: String) {
        GLRender(text)
    }

    fun GLRender(name:String){
        println("OpenGL:$name")
    }
}