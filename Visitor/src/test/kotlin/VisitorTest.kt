import impl.Visitor1
import impl.Visitor2
import org.junit.jupiter.api.Test
import shape.ShapeContainer
import engine.impl.DirectX
import shape.impl.*


class VisitorTest {
    @Test
    fun unitTest(){
        val structure = ObjectStructure()

        // 將Visitor走訪ObjectStructure裡的各元表
        structure.runVisitor(Visitor1())
        structure.runVisitor(Visitor2())
    }

    @Test
    fun unitTest2(){
        val directX = DirectX()

        // 加入形狀
        val shapeContainer = ShapeContainer()
        shapeContainer.addShape(Cube(directX))
        shapeContainer.addShape(Cylinder(directX))
        shapeContainer.addShape(Sphere(directX))

        // 繪圖
        shapeContainer.runVisitor(DrawVisitor())

        // 頂點數
        val vertexCount = VertexCountVisitor()
        shapeContainer.runVisitor(vertexCount)
        println("頂點數:${vertexCount.mCount}")

        // 圓體積
        val sphereVolume = SphereVolumeVisitor()
        shapeContainer.runVisitor(sphereVolume)
        println("圓體積:${sphereVolume.mVolume}")
    }
}