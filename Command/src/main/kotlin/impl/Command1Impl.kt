package impl

import Command
import Receiver1

class Command1Impl(var mReceiver: Receiver1?=null, var mCommand:String="") :Command(){
    override fun excute() {
        mReceiver?.action(mCommand)
    }
}

