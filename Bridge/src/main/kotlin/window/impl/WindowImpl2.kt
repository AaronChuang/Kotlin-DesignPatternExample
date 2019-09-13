package window.impl

import window.AbstractWindowImpl

class WindowImpl2:AbstractWindowImpl() {
    override fun devDrawText(text:String){
        println("WindowImpl2.devDrawText: $text")
    }
    override fun devDrawLine(line:String){
        println("WindowImpl2.devDrawLine: $line")
    }
}