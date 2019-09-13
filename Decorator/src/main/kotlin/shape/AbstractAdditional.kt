package shape

// 額外功能
abstract class AbstractAdditional {
    protected lateinit var mRenderEngine : IRenderEngine

    fun setRenderEngine(engine:IRenderEngine){
        mRenderEngine = engine
    }

    abstract fun drawOnShape(shape: AbstractShape)
}