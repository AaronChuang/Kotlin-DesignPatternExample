package impl

import AbstractColleague
import IMediator

// 實作Colleague的類別2
class ColleagueImpl2(mMediator: IMediator) : AbstractColleague(mMediator) {

    fun action(){
        mMediator.sendMessage(this,"Colleague2發出通知")
    }

    // Mediator通知請求
    override fun request(message: String) {
        println("ColleagueImpl2.request:$message")
    }
}