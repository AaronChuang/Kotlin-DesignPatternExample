// 負責封裝當Context處於特定狀態時所該展現的行為
abstract class AbstractState(protected val mContext: Context) {
    abstract fun handle(value: Int)
}