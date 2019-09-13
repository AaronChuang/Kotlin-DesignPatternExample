package window.impl

import window.AbstractWindow

// 擴充Abstraction所訂之介面
class TransientWindow:AbstractWindow() {
    override fun show() {
        drawRect("TransientWindow")
    }
}