// 單例模式
class Singleton private constructor() {
    var name = ""

    companion object{
         var instance:Singleton? = null
            get() {
                if(field == null){
                    println("產生Singleton")
                    field = Singleton()
                }
                return field
            }
            private set
    }
}