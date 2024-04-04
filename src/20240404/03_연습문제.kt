package `20240404`

import java.util.Scanner

fun main() {
    print("정수를 입력하세요 : ")
//    val num = readln().toInt()

    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    if (num > 0) {
        println("양수 입니다.")
    } else if (num == 0) {
        print("0 입니다.")
    } else {
        print("음수 입니다.")
    }

    print("성적을 입력하세요 : ")
    val score = readln().toInt()

    if (score <= 100 && score >= 90) {
        println("학점 A")
    }
    else if (score < 90 && score >= 80) {
        println("학점 B")
    }
    else if (score < 80 && score >= 70) {
        println("학점 C")
    }
    else if (score < 70 && score >= 60) {
        println("학점 D")
    }
    else if (score < 60 && score >= 0) {
        println("학점 F")
    }

}
