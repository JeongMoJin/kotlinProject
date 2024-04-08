package `20240408`

fun main() {
    var game = 6
    val match = 6
    while (game < match) {
        println("while 테스트입니다.")
        game++
    }

    // do ~ while 테스트
    game = 6
    do {
        println("do ~ while 테스트입니다.")
        game++
    } while (game < match)
}
/*
do ~ while 테스트입니다.
 */