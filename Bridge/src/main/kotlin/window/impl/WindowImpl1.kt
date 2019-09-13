package window.impl

import window.AbstractWindowImpl

class WindowImpl1:AbstractWindowImpl() {
    override fun devDrawText(text:String){
        println("WindowImpl1.devDrawText: $text")
    }
    override fun devDrawLine(line:String){
        println("WindowImpl1.devDrawLine: $line")
    }
}