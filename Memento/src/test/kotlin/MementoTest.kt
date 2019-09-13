import org.junit.jupiter.api.Test

class MementoTest {

    @Test
    fun unitTest1(){
        val originator = Originator()

        // 設定資訊
        originator.setInfo("Step1")
        originator.showInfo()

        // 儲存狀態
        val memnto = originator.createMemento()

        // 設定新的資訊
        originator.setInfo("Step2")
        originator.showInfo()

        // 復原
        originator.setMemento(memnto)
        originator.showInfo()
    }

    @Test
    fun unitTest2(){
        val originator = Originator()
        val caretaker = Caretaker()
        // 設定資訊
        originator.setInfo("version1")
        originator.showInfo()

        // 保存
        caretaker.addMemento("1", originator.createMemento())

        // 設定資訊
        originator.setInfo("version2")
        originator.showInfo()

        // 保存
        caretaker.addMemento("2", originator.createMemento())

        // 設定資訊
        originator.setInfo("version3")
        originator.showInfo()

        // 保存
        caretaker.addMemento("3", originator.createMemento())

        // 退回到第2版,
        originator.setMemento( caretaker.getMemento("2"))
        originator.showInfo()

        // 退回到第1版,
        originator.setMemento( caretaker.getMemento("1"))
        originator.showInfo()
    }
}