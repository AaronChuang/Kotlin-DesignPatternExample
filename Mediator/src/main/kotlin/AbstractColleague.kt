// Mediator所控管的Colleague
abstract class AbstractColleague(val mMediator:IMediator) {
    // Mediator通知請求
    abstract fun request(message:String)
}
