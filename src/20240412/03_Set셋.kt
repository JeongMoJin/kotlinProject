package `20240412`

fun main() {
    // 읽기 전용 셋
    val immutableSet = setOf(1,1,2,2,3,3)
    println(immutableSet) // [1, 2, 3]

    // 읽기, 쓰기 가능 셋
    // 1) 빈 셋으로 초기화하고 값 입력하기
    var set = mutableSetOf<String>()
    set.add("JAN")
    set.add("FEB")
    set.add("MAR")
    set.add("JAN") // 셋은 중복을 허용하지 않기 때문에 동일한 값은 입력되지 않음

    // 2) 셋 사용하기
    // 인덱스로 조회하는 메서드가 없기 때문에 특정 위치의 값을 직접 사용할 수 없음
    println("Set 전체 출력 : ${set}") // Set 전체 출력 : [JAN, FEB, MAR]

    // 3) 삭제하기
    // 값이 중복되지 않기 때문에 값으로 직접 조회해서 삭제 할 수 있음
    set.remove("FEB")
    println("Set 전체 출력 : ${set}") // Set 전체 출력 : [JAN, MAR]

    // 읽기 쓰기 모두 가능한 셋
    val mutableSet = mutableSetOf(1,1,2,2,2,3,3)
    println(mutableSet.add(100)) // true
    println(mutableSet.add(3)) // false 이미 있기에 false

    mutableSet.remove(1)
    mutableSet.remove(200)

    println(mutableSet) // [2,3,100]
    println(mutableSet.contains(1))
}

















