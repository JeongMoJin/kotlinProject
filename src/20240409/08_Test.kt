package `20240409`

import ch_01.day240118.Account
import java.util.*

object KoreaItTest {
    private const val max = 3
    private val scanner = Scanner(System.`in`)
    private val accounts = arrayOfNulls<Account>(max) // 0 1 2 가능
    private var idx = 0

    @JvmStatic
    fun main(args: Array<String>) {
        var run = true
        while (run) {
            println("----------------------------------------------------------")
            println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료")
            println("----------------------------------------------------------")
            print("선택> ")

            val selectNo = scanner.nextInt()

            when (selectNo) {
                1 -> createAccount()
                2 -> viewAccountList()
                3 -> deposit()
                4 -> withdraw()
                5 -> viewAccount()
                6 -> run = false
                else -> println("다시 입력해주세요")
            }
        }
        println("프로그램 종료")
    }

    fun createAccount() {
        if (idx < max) {
            println("--------------")
            println("계좌생성")
            println("--------------")

            print("계좌번호: ")
            val ano = scanner.next()

            print("계좌주: ")
            val owner = scanner.next()

            print("초기입금액: ")
            val balance = scanner.nextInt()

            val account = Account(ano, owner, balance)
            accounts[idx] = account
            println("결과: 계좌가 생성되었습니다.")
            idx++
        } else {
            println("생성 가능한 계좌의 범위를 초과했습니다.")
        }
    }

    fun viewAccountList() {
        println("--------------")
        println("계좌목록")
        println("--------------")
        for (i in 0 until idx) {
            if (accounts[i] != null) {
                print(accounts[i]!!.ano)
                print(" ")
                print(accounts[i]!!.owner)
                print(" ")
                print(accounts[i]!!.balance)
                println()
            } else {
                break
            }
        }
    }

    fun deposit() {
        println("----------------")
        println("예금")
        println("----------------")
        print("계좌번호: ")
        val searchAno = scanner.next()
        val account = findAccount(searchAno)
        if (account == null) {
            println("결과: 계좌가 없습니다.")
        } else {
            println("예금액: ")
            val plusBalance = scanner.nextInt()
            if (plusBalance > 0) {
                account.balance = account.balance + plusBalance
                println("결과: 예금이 성공되었습니다.")
            } else {
                println("0원 이상만 입금가능합니다.")
            }
        }
    }

    fun withdraw() {
        println("----------------")
        println("출금")
        println("----------------")
        print("계좌번호: ")
        val searchAno = scanner.next()
        val account = findAccount(searchAno)
        if (account == null) {
            println("결과: 계좌가 없습니다.")
        } else {
            println("출금액: ")
            val minusBalance = scanner.nextInt()
            if (minusBalance < 0) {
                println("0원 이상만 출금가능합니다.")
            } else if (minusBalance > account.balance) {
                println("결과: 잔액보다 출금액이 커서 출금에 실패했습니다.")
            } else {
                account.balance = account.balance - minusBalance
                println("결과: 출금이 성공되었습니다.")
            }
        }
    }

    fun viewAccount() {
        println("----------------")
        println("조회")
        println("----------------")
        print("계좌번호: ")
        val searchAno = scanner.next()
        val account = findAccount(searchAno)
        if (account != null) {
            print(account.ano)
            print(" ")
            print(account.owner)
            print(" ")
            print(account.balance)
            println()
        } else {
            println("결과: 계좌가 없습니다.")
        }
    }

    private fun findAccount(searchAno: String): Account? {
        var account: Account? = null
        for (i in 0 until idx) {
            if (accounts[i] != null) {
                if (accounts[i]!!.ano == searchAno) {
                    account = accounts[i]
                    break
                }
            } else {
                break
            }
        }
        return account
    }
} // if 문 말고 스위치 표현식(스위치문x 화살표) 메인 메서드에 기입
// 객체 생성 클래스 제공
// case3 (count) 처럼 idx 활용
// tip : 에러 메세지 + 출력 글자까지 똑같이 맞추기