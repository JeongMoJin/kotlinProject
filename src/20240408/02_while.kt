package `20240408`

fun main() {
    // current 변수가 인덱스의 역할
    var current = 1
    val until = 12
    while (current < until) {
        println("현재 값은 ${current}입니다.")
        current++
    }
}

/*
현재 값은 1입니다.
현재 값은 2입니다.
현재 값은 3입니다.
현재 값은 4입니다.
현재 값은 5입니다.
현재 값은 6입니다.
현재 값은 7입니다.
현재 값은 8입니다.
현재 값은 9입니다.
현재 값은 10입니다.
현재 값은 11입니다.
 */