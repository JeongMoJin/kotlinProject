package `20240416`

/*
4. 오브젝트
오브젝트 Object를 사용하면 클래스를 생성자로 인스턴스화 하지 않아도 블록 안의 프로퍼티와 메서드를 호출해서 사용할 수 있음
자바의 static과 같은 역할
object 코드 블록 안의 프로퍼티와 메서드는 클래스명에 점 연산자를 붙여서 생성자 없이 직접 호출할 수 있음
주의할 점은 클래스명을 그대로 사용하기 때문에 호출하는 클래스명의 첫 글자가 대문자
 */
object Cat {
    var name: String ="pinky"
    fun printName() {
        println("Cat의 이름은 ${name}입니다.")
    }
}
fun main() {
    Cat.name = "mikey"
    Cat.printName() // Cat의 이름은  mikey 입니다.
}