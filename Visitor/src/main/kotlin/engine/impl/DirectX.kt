package engine.impl

import engine.RenderEngine

// DirectX引擎
class DirectX: RenderEngine {
    override fun render(name: String) {
        DXRender(name)
    }

    override fun text(text: String) {
        DXRender(text)
    }

    fun DXRender(name:String){
        println("DXRender:$name")
    }
}