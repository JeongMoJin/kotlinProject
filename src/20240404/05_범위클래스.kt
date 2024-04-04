package `20240404`

fun main() {
    val numRange : IntRange = 1..5
    println(numRange)

    println(numRange.contains(3)) // true
    println(numRange.contains(10)) // false

    // 알파벳의 범위도 마찬가지. CharRange 클래스를 사용
    val charRange: CharRange = 'a'..'e'
    println(charRange.contains('b')) // true
    println(charRange.contains('z')) // false
}