package window.impl

import window.AbstractWindow

// 擴充Abstraction所訂之介面
class IconWindow:AbstractWindow() {
    override fun show() {
        drawRect("IconWindow")
        drawText("IconWindow")
    }
}