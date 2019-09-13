package shape

// 形狀
abstract class AbstractShape {
    protected lateinit var mRenderEngine : IRenderEngine

    open fun setRenderEngine(engine:IRenderEngine){
        mRenderEngine = engine
    }

    abstract fun draw()
    abstract fun getPolygon():String
}