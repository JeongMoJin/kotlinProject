package `20240417`

class `04_추상클래스` {
    abstract class Game {
        fun startGone() {
            println("게임을 시작했습니다.")
        }

        // 추상 메서드
        abstract fun printName()
    }

    class OverWatch : Game() {
        override fun printName() { // 추상메서드 구현
            println("오버워치입니다.")
        }
    }
}

fun main() {
    val overWatch = `04_추상클래스`.OverWatch()
    overWatch.startGone() // Game 클래스 메서드
    overWatch.printName() // OverWatch 클래스에서 구현한 메서드
}