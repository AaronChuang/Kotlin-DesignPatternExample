package impl

import AbstractColleague
import IMediator

// 實作Mediator界面，並集合管理Colleague物件
class MediatorImpl:IMediator {
    lateinit var mColleague1:ColleagueImpl1
    lateinit var mColleague2:ColleagueImpl2

    fun setColleague1(colleague:ColleagueImpl1){
        mColleague1 = colleague
    }

    fun setColleague2(colleague:ColleagueImpl2){
        mColleague2 = colleague
    }

    // 收到由Colleague通知請求
    override fun sendMessage(colleague: AbstractColleague, message: String) {
        // 收到Colleague1通知Colleague2
        if( mColleague1 == colleague)
            mColleague2.request(message)

        // 收到Colleague2通知Colleague1
        if( mColleague2 == colleague)
            mColleague1.request(message)
    }
}