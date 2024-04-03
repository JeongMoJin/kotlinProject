package `20240403`

fun main() {
    var num = 256

    if (num is Int) { // num의 자료형이 Int라면 실행
        println(num)
    } else if (num !is Int) {
        println("Not an Int")
    }

    val x: Any
    x = "Hello"
    if (x is String) {
        println(x.length) // 5
    }
}