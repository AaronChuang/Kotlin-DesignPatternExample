package impl

import AbstractColleague
import IMediator

// 實作Colleague的類別1
class ColleagueImpl1(mMediator: IMediator) : AbstractColleague(mMediator) {

    fun action(){
        mMediator.sendMessage(this,"Colleague1發出通知")
    }

    // Mediator通知請求
    override fun request(message: String) {
        println("ColleagueImpl1.request:$message")
    }
}