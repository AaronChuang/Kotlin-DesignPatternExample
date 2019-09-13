import org.junit.jupiter.api.Test
import bridge.Abstraction
import bridge.impl.Implementor1Impl
import bridge.impl.Implementor2Impl
import bridge.impl.RefinedAbstraction1Impl
import bridge.impl.RefinedAbstraction2Impl
import window.AbstractWindow
import window.impl.TransientWindow
import window.impl.IconWindow
import window.impl.WindowImpl1
import window.impl.WindowImpl2

class BridgeTest {
    @Test
    fun unitTest(){
        // 產生
        var abstraction: Abstraction = RefinedAbstraction1Impl()

        // 設定
        abstraction.setImplementor(Implementor1Impl())
        abstraction.operation()

        // 設定
        abstraction.setImplementor(Implementor2Impl())
        abstraction.operation()

        // 產生
        abstraction = RefinedAbstraction2Impl()

        // 設定
        abstraction.setImplementor(Implementor1Impl())
        abstraction.operation()

        // 設定
        abstraction.setImplementor(Implementor2Impl())
        abstraction.operation()
    }

    @Test
    fun windowUnitTest(){
        var pWindow: AbstractWindow?

        // 產生在WindowImpl1環境下的IconWindow
        pWindow = IconWindow()
        pWindow.setImplementor(WindowImpl1())
        pWindow.show()

        // 產生在WindowImpl2環境下的IconWindow
        pWindow.setImplementor(WindowImpl2())
        pWindow.show()

        // 產生在WindowImpl1環境下的TransientWindow
        pWindow = TransientWindow()
        pWindow.setImplementor(WindowImpl1())
        pWindow.show()

        // 產生在WindowImpl2環境下的TransientWindow
        pWindow = TransientWindow()
        pWindow.setImplementor(WindowImpl2())
        pWindow.show()
    }
}