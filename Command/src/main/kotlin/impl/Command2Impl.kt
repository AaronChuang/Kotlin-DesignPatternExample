package impl

import Command
import Receiver2

class Command2Impl(var mReceiver: Receiver2?=null, var param:Int=0) :Command(){
    override fun excute() {
        mReceiver?.action(param)
    }
}

