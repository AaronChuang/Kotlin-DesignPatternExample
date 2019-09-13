import impl.ElementA
import impl.ElementB

// 用來存儲所有的Element
class ObjectStructure {
    val mContext = mutableListOf<IElement>()
    init {
        mContext.add(ElementA())
        mContext.add(ElementB())
    }

    // 載入不同的Action(Visitor)來判斷
    fun runVisitor(visitor:IVisitor) {
        mContext.forEach {
            it.accept(visitor)
        }
    }
}