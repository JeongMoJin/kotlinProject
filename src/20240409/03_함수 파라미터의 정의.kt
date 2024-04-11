package `20240409`

fun main() {
    /*
    fun 함수 이름 ( (val 생략) name1: String,
    name2 : Int, name3: Double) {
    실행코드
    }
     */
    fun newFun(name: String, age: Int = 29, weight: Double = 65.5) {
        // name = "tom" // val cannot be reassigned
        println("name의 값은 ${name}입니다.")
        println("age 값은 ${age}입니다.")
        println("weight 값은 ${weight}입니다.")
    }

    // 정의된 newFun() 함수를 호출할 때 기본값이 없는 첫 번째 파라미터에먼 값을 입력하면
    // 두 번째와 세 번째 파라미터에는 설정한 기본값이 자동으로 입력
    newFun("Hello")

    newFun("Michael", weight = 67.5)
}