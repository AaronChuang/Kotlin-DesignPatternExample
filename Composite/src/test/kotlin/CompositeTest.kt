import impl.Composite
import impl.Leaf
import org.junit.jupiter.api.Test

class CompositeTest {
    @Test
    fun unitTest1() {
        // 根節點
        val root = Composite("root")
        // 加入兩個最終節點
        root.add(Leaf("leaf1"))
        root.add(Leaf("leaf2"))

        // 子節點1
        val child1 = Composite("child1")
        // 加入兩個最終節點
        child1.add(Leaf("child1.leaf1"))
        child1.add(Leaf("child1.leaf2"))
        root.add(child1)

        // 子節點2
        // 加入3個最終節點
        val child2 = Composite("child2")
        child2.add(Leaf("child2.leaf1"))
        child2.add(Leaf("child2.leaf2"))
        child2.add(Leaf("child2.leaf3"))
        root.add(child2)

        // 顯示
        root.operation()
    }

    @Test
    fun unitTest2(){
        // 產生一最終節點
        val leaf = Leaf("leaf1")

        // 加入節點
        leaf.add(Leaf("leaf2"))  // 錯誤
    }
}