package `20240404`

fun main() {
    /*
    when (파라미터) {
        비교값 -> {
            변수값이 비교값과 같다면 이 영역이 실행.
        }
    }
    switch문과 비교하면 값을 비교하는 줄 앞의 case가 없어지고, 비교값 다음의 콜론이 화살표 연산자(->)로 대체

   when(파라미터) {
        비교값1 -> {
            변수값이 비교값1과 같다면 이 영역이 실행
        }
        비교값2 -> {
            변수값이 비교값2와 같다면 이 영역이 실행
        }
        else -> {
            변수값이 앞에서 비교한 값들과 다르면 이 영역이 실행
        }
   }
     */
//    val now = 10
//    when (now) {
//        8 -> {
//            println("현재 시간은 8시입니다.")
//        }
//        9 -> {
//            println("현재 시간은 9시입니다.")
//        }
//        else -> { // 위의 조건에 맞지 않으면 else 다음 코드가 실행
//            println("현재 시간은 9시가 아닙니다.")
//        }
//    }
    
    val now = 9
    when (now) {
        8, 9 -> {
            println("현재 시간은 8시 또는 9시 입니다.")
        }
        else -> {
            println("현재 시간은 9시가 아닙니다.")
        }
    }
    
    val ageOfMichael = 19
    when (ageOfMichael) {
        in 10..19 -> {
            println("마이클은 10대입니다.")
        }
        !in 10..19 -> {
            println("마이클은 10대가 아닙니다.")
        }
        else -> {
            println("마이클의 나이를 알 수 없습니다.")
        }
    }

    val currentTime = 6
    when {
        currentTime == 5 -> {
            println("현재 시간은 5시입니다.")
        }
        currentTime > 5 -> {
            println("현재 시간은 5시가 넘었습니다.")
        }
        else -> {
            println("현재 시간은 5시 이전입니다.")
        }
    }


    print("점수을 입력하세요 : ")
    val score = readln().toInt()

    when (score){
        in 90..100 ->{
            println("입력하신 성적은 ${score}점이고, 학점은 A입니다.")
        }
        in 80..89 ->{
            println("입력하신 성적은 ${score}점이고, 학점은 B입니다.")
        }
        in 70..79 ->{
            println("입력하신 성적은 ${score}점이고, 학점은 C입니다.")
        }
        in 60..69 ->{
            println("입력하신 성적은 ${score}점이고, 학점은 D입니다.")
        }
        in 0..59 ->{
            println("입력하신 성적은 ${score}점이고, 학점은 F입니다.")
        }
    }

    var credit = when (score/10*10) {
        90, 100 -> 'A'
        80 -> 'B'
        70 -> 'C'
        60 -> 'D'
        else -> 'F'
    }

    // 범위 사용
    credit = when(score) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    
    
    
    
    
    
    
}