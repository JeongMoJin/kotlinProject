package `20240408`

fun main() {
    var students: IntArray = IntArray(10) // 변수 student에 Int(정수형) 공간을 10개 할당하라는 의미.
    var longArray = LongArray(10)
    var charArray = CharArray(10)
    var floatArray = FloatArray(10)
    var doubleArray = DoubleArray(10)

    println(students[0]) // 0 -> 따로 초기화 하지 않으면 0으로 초기화
    /*
    1) 문자열 배열에 빈 공간 할당하기
    String은 기본 타입이 아니기 때문에 StringArray는 없지만 다음과 같이 사용할 수 있음
    수식이 조금 특이해 보일 수 있지만 일단은 괄호 안의 첫 번째 숫자인 10만 변경해서 사용하면
    그 숫자만큼 빈 문자열로 된 배열 공간을 할당
    -> 자바에서는 문자열 배열을 생성하면서 초기화 하지 않으면 null이 초기값이 됨
    하지만 코틀린은 기본적으로 null 사용을 허용하지 않기 때문에
    빈 문자열을 이용해서 따로 초기화 해야 함
     */
    var stirngArray = Array(10, {item->""})

    /*
    2) 값으로 배열 공간 할당하기
    arrayOf() 함수를 사용해서 String값을 직접 할당할 수도 있음
     */
    var dayArray: Array<String> = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

    var intArray: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var intArray2: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)

    /*
    3) 배열에 값 입력하기

    다음은 배열에 인덱스에 있는 값을 바꾸는 방법을 다른 방식으로 표현한 것
    이 두 방식은 표현식만 다를 뿐 동일한 코드
    1. 배열을 선언한 변수명 옆에 대괄호([])를 사용하고, 대괄호 안에 값을 저장할 위치의 인덱스 번호를 작성
    그리고 등호(=)를 사용해서 값을 입력하면 됨
    배열명[인덱스] = 값

    2. set메서드를 사용할 수 있음. 배열이 제공하는 set() 메서드에 인덱스와 값을 파라미터로 넘겨주면 됨
    배열명.set(인덱스, 값)
     */

    students[0] = 90
    students.set(1, 91)

    /*
    4) 배열에 있는 값 꺼내기
    값을 입력할 때와 같은 방식으로 인덱스로 값을 가져올 수 있음
    저장할 때와 마찬가지로 대괄호 안에 인덱스를 입력해서 가져올 수 있으며 값을 꺼내는 배열의 메서드는 get()
    배열명[인덱스]
    배열명.get(인덱스)
     */
    // 배열 students의 일곱번째 값을 seventhValue 변수에 저장
    var seventhValue = students[6]

    // 배열 students의 열번째 값을 tenthValue 변수에 저장
    var tenthValue = students.get(9)






}
















