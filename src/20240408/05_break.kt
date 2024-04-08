package `20240408`

fun main() {
    for (index in 1..10) {
        println("현재 index는 ${index}입니다.")
        if (index > 5) { // index가 5보다 크면 break 명령어로 현재 반복문을 벗어남
            break
        }
    }
}

/*
현재 index는 1입니다.
현재 index는 2입니다.
현재 index는 3입니다.
현재 index는 4입니다.
현재 index는 5입니다.
현재 index는 6입니다.
 */