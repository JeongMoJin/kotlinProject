package `20240403`

fun main() {
    val a : Int = 1
//    val b : Double = a // 자료형 불일치 오류 발생. 자바와 차이점
//    val c: Int = 1.1 // 자료형 불일치 오류 발생

    val b: Double = a.toDouble()
    println("a = $a, b= $b") // a =1 , b = 1.0

    val result = b + a
    println("result = $result") // result = 2.0


}