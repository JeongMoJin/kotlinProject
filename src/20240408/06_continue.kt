package `20240408`

fun main() {
    for (except in 1..10) {
        // except가 3보다 크고 8보다 작으면 continue 명령으로 로그를 찍지 않고 다름 반복문으로 이동
        if (except > 3 && except < 8) {
            continue
        }
        println("현재 index는 ${except}입니다.")
    }
}

/*
현재 index는 1입니다.
현재 index는 2입니다.
현재 index는 3입니다.
현재 index는 8입니다.
현재 index는 9입니다.
현재 index는 10입니다.
 */