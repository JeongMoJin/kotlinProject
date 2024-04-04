package `20240404`

fun main() {
    var a: Any = 1 // Any형 a는 1로 초기화될 때 Int형이 됨
    a = "one" // Int형이었던 a는 변경된 값에 의해 String이 됨
    println("a: $a type: ${a.javaClass}") // 자바의 기본형을 출력하면 String이 나옴.

    checkArg("Hello") // 문자열을 인자로 넣음
    checkArg(5) // 숫자를 인자로 넣음
}

fun checkArg(x: Any) { // 인자를 Any형으로 받음
    if (x is String) {
        println("x is String: $x")
    }

    if (x is Int) {
        println("x is Int: $x")
    }
}