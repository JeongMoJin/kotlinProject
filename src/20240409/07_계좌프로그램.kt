package `20240409`

fun main() {
    val max = 3
    val anos = Array(max, {""}) // 통장번호
    val owners = Array(max, {""}) // 예금주
    val balances = IntArray(max) // 잔액
    var idx = 0 // 생성된 계좌수
    var run = true

    while (run) {
        println("----------------------------------------------------------")
        println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료")
        println("----------------------------------------------------------")
        print("선택> ")

        val selectNo: Int = readln().trim().toInt()
        when (selectNo) {
//			1 -> createAccount()
//			2 -> viewAccountList()
//			3 -> deposit()
//			4 -> withdraw()
//			5 -> viewAccount()
            6 -> run = false
        }
    }
    println("프로그램 종료")
}