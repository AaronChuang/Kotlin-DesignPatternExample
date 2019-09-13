import impl.FlyweightImpl

// 負責產生Flyweight的工廠介面
class FlyweightFactor {
    var mFlyweights = mutableMapOf<String, AbstractFlyweight>()

    // 取得共用的元件
    fun getFlyweight(key: String, content: String): AbstractFlyweight {
        if (mFlyweights.containsKey(key))
            return mFlyweights[key]!!

        // 產生並設定內容
        val flyweight = FlyweightImpl(content)
        mFlyweights[key] = flyweight
        println("New FlyweightImpl key[$key] content[$content]")
        return flyweight
    }

    // 取得元件(只取得不共用的Flyweight)
    fun getUnsharedFlyweight(content: String): UnsharedFlyweight {
        return UnsharedFlyweight(content)
    }

    // 取得元件(包含共用部份的Flyweight)
    fun getUnsharedFlyweight(key: String, sharedContent: String, unsharedContent: String): UnsharedFlyweight {
        // 先取得共用的部份
        val sharedFlyweight = getFlyweight(key, sharedContent)

        // 產出元件
        val flyweight = UnsharedFlyweight(unsharedContent)
        flyweight.setFlyweight(sharedFlyweight) // 設定共享的部份
        return flyweight
    }
}