package `20240412`

fun main() {
    // 읽기 전용 맵
    val immutableMap = mapOf("name" to "tom", "age" to 28, "age" to 20, "height" to 170)
    println(immutableMap)

    /*
    1) 맵 생성하기
    키와 값이 데이터 타입을 모두 String으로 사용
     */
    var map = mutableMapOf<String, String>()

    /*
    2) 값 추가하기
    값을 추가하기 위해 제공되는 put 메서드에 키와 값을 입력
     */

    map.put("키1", "값1")
    map.put("키2", "값2")
    map.put("키3", "값3")

    /*
    3) 맵 사용하기
    get 메서드에 키를 직접 입력해서 값을 사용할 수 있음
     */

    println("map에 입력된 키1의 값은 ${map.get("키1")}입니다.")

    /*
    4) 맵 수정하기
    put() 메서드를 사용할 때 동일한 키를 가진 값이 있으면 키는 유지된 채로 값만 수정
     */
    
    map.put("키2", "수정한 값")
    println("map에 입력된 키2의 값은 ${map.get("키2")}입니다.")
    map["키2"] = "수정한 값 !!"
    println("map에 입력된 키2의 값은 ${map.get("키2")}입니다.")

    /*
    5) 맵 삭제하기
    remove() 메서드에 키를 입력해 값을 삭제 할 수 있음
     */

    map.remove("키1")

    // 없는 값을 불러오면 null값이 출력됨
    println("map에 입력된 키1의 값은 ${map.get("키1")}입니다.")

}























