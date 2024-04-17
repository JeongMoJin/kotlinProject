package `20240417`

fun main() {
    open class Flower {
        open fun waterFlower() {
            println("water flower")
        }
    }
    // 콜론 : 을 이용해 상속을 나타내면 됨
    class Rose: Flower() {
        override fun waterFlower() {
            super.waterFlower()
            println("Rose is water flower")
        }
    }
    val rose = Rose() // 객체 생성
    rose.waterFlower()
}