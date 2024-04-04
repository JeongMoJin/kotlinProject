package `20240404`

fun main() {
    var out = 0
    var strike = 3
    if (strike > 2) {
        out = out + 1
    }
    println("out: $out") // 1
    
    var ball = 4 
    if (ball > 3) { // 조건식이 참이면 여기 코드 블럭이 실행
        println("4볼로 출루합니다.")
    } else { // 조건식이 거짓이면 여기 코드 블럭이 실행
        println("타석에서 다음 타구를 기다립니다.")
    }

    var a = 5;
    var b = 3;
    var bigger = if (a>b) a else b;
    println("bigger: $bigger") // 5

    bigger = if (a>b) {
        var c = 30
        a // 마지막 줄의 a 값이 bigger에 저장
    } else {
        b
    }
    println("bigger: $bigger")

    var eraOfRyu = 2.32
    var eraOfDegrom = 2.43

    val era = if (eraOfRyu < eraOfDegrom) {
        println("2019 류현진이 디그룸을 이겼습니다.")
        eraOfRyu
    } else {
        println("2019 디그룸이 류현진을 이겼습니다.")
        eraOfDegrom
    }
    println("2019 MLB에서 가장 높은 ERA는 ${era}입니다.")

    val myAge = 20
    val isAdult = if (myAge > 20) true else false

    println("성인 여부 : $isAdult")
}
















