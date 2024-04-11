package `20240409`

fun main() {
    /*
    fun 함수이름 (파라미터 이름 : 타입) : 반환타입 {
        return 값
    }
     */

    fun square(x:Int) : Int {
        return x * x
    }

    fun printSum(x: Int, y: Int) {
        println("x + y = ${x+y}")
    }

    fun getPi() : Double {
        return 3.14
    }

    val PI = getPi()
    println("지름이 10인 원의 둘레는 ${PI}입니다.")
}