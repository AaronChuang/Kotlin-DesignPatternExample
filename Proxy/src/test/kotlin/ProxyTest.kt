import impl.Proxy
import org.junit.jupiter.api.Test

class ProxyTest {

    @Test
    fun unitTest(){
        // 產生Proxy
        val proxy = Proxy()

        // 透過Proxy存取
        proxy.request()
        proxy.mConnectRemote = true
        proxy.request()
    }
}