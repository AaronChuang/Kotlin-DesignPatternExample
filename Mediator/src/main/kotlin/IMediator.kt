// 用來管理Colleague物件的介面
interface IMediator {
    fun sendMessage(colleague: AbstractColleague, message:String)
}