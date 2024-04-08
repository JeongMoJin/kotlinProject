package `20240408`

fun main() {
    /*
    음수가 입력될 때까지, 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성하세요.
	while문을 사용, break 사용하지 말 것
	1) while문으로 작업
	2) do while문으로 작업
     */
    var whileOnOff = true
    var sum = 0;
    var sum2 = 0;

    while (whileOnOff) {
        print("정수를 입력해주세요(음수 입력 시 종료) >> ")
        var num = readln().toInt()
        if (num < 0) {
            println("정수의 합은 $sum 입니다.")
            whileOnOff = false;
        }
        sum += num;
    }

    println("-----------------do While----------------------")

    do {
        print("정수를 입력해주세요(음수 입력 시 종료) >> ")
        var num = readln().toInt()
        if (num < 0) {
            println("정수의 합은 $sum2 입니다.")
        }
        sum2 += num;
    } while (num > 0)

    println("-----------------선생님 코드----------------------")
    var sum3 = 0
    var value = 0

    // while문의 조건이 1) 처음에 참이 되어야 하고 2) 합에 영향을 미치지 않아야 함
    while (value >=0) {
        sum3 += value
        print("정수를 입력하세요: ")
        value = readln().toInt()
    }
    println("정수의 합계는 ${sum3}입니다.")
}