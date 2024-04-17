package `20240417`

/*
    데이터 클래스

    코틀린은 간단한 값의 저장 용도로 데이터 클래스 data class를 제공
    데이터 클래스의 기본 형식은 다음과 같음

    data class 클래스이름 (val 파라미터1: 타입, var 파라미터2: 타입)

    데이터 클래스를 정의할 때 class 앞에 data 키워드를 사용해야 하고, 생성자 파라미터 앞에 입력하는 var 또는 val 키워드를 생략 할 수 없음

    생성하는 코드는 일반 클래스와 동일하게 작성
 */
fun main() {
    // 정의 - 주로 코드 블록(클래스 스코프)을 사용하지 않고 간단하게 작성
    data class UserData(val name: String, var age: Int)

    // 생성 - 일반 class의 생성자 함수를 호출하는 것과 동일
    val userData = UserData("Michael", 21)

    // name은 val로 선언되었기 때문에 변경 불가능
//    userData.name = "sindy"

    // age는 var로 선언되었기 때문에 변경 가능
    userData.age = 19

    // 1) toString() 메서드와 copy() 메서드
    // 일반 클래스에서 toString() 메서드를 호출하면 인스턴스의 주소값을 반환하지만, 데이터 클래스는 값을 반환하기 때문에 실제 값을 모니터링 할 때 좋음
    println("userData는 ${userData}")
    println(userData.toString())

    // 또 copy() 메서드로 간단하게 값을 복사할 수 있음
    var newData: UserData = userData.copy()
    println(newData)
    
    /*
    이처럼 클래스와 사용법이 동일하지만 주로 네트워크를 통해 데이터를 주고 받거나, 혹은 로컬 앱의 데이터베이스에서 데이터를 다루기 위한 용도로 사용
     */

    data class Memo(val title:String, val content: String, var isDone: Boolean)
    val memo1 = Memo("마트 가기", "계란, 우유, 빵", false)

    /*
    데이터 클래스는 toString(), copy()와 같은 메서드를 자동으로 만들어줌.
    각 메서드의 역할은 다음과 같음.

    * toString() : 객체에 포함되어 있는 데이터를 출력하여 볼 수 있음. 생성자에 포함된 프로퍼티만 출력
    * copy() : 객체의 속성들을 복사하여 반환하는 메서드이며 인수로 받은 프로퍼티만 해당 값으로 바뀌어 복사해줌
     */
    val memo2 = memo1.copy(content = "칫솔, 과자") // content 프로퍼티 변경
    println(memo1.toString()) // Memo(title=마트 가기, content=계란, 우유, 빵, isDone=false)
    println(memo2.toString()) // Memo(title=마트 가기, content=칫솔, 과자, isDone=false)
}