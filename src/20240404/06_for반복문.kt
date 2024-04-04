package `20240404`

fun main() {
    for (index in 1..10) {
        println("현재 숫자는 $index")
    }

    // until : 마지막 숫자 제외하기
    // 시작값과 종료값 사이의 .. 대신에 until을 사용하면 '종료값 이전'까지만 반복.
    /*
    for (변수 in 시작값 until 종료값) {
        실행코드
    }
    배열의 index가 항상 0부터 시작하기 때문에 배열의 인덱스를 사용하여 처리하는 코드에서 사용
    배열의 인덱스가 0부터 시작하기 때문에 배열의 크기는 항상 '마지막 인덱스 +1의 값',
    따라서 반복을 할 때 배열의 크기 바로 전까지만 반복
     */
    val array: Array<String> = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (index in 0 until array.size) {
        println("현재 월은 ${array[index]}입니다.")
    }

    for (index in 0..100 step 3) {
        println("현재 숫자는 ${index}")
    }

    for (index in 10 downTo 0) {
        println("현재 숫자는 ${index}")
    }
    for (index in 10 downTo 0 step 3) {
        println("현재 숫자는 ${index}")
    }

    val arrayMonth = arrayOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN")
    for (month in arrayMonth) {
        println("현재 월은 ${month}입니다.")
    }

    // withIndex() 함수를 이용하면 요소의 인덱스도 함께 가져올 수 있음
    val students = arrayOf("John", "Peter", "Jane")
    for ((index, name) in students.withIndex()) {
        println("Index: $index, Name: $name")

    }


}