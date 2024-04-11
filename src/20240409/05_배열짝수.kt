package `20240409`

fun main() {
    /* 배열을 전달 받아 짝수만 출력하는 메서드 작업 */
    val numbers = IntArray(10)
    for (i in numbers.indices) {
        numbers[i] = i + 1
    }
    print("main() : ")
    for (i in numbers.indices) {
        print(numbers[i])
        if (i < numbers.size - 1) {
            print(", ")
        }
    }

    println()
    printOdd(numbers) // printOdd() : 2, 4, 6, 8, 10
}

fun printOdd(numbers:IntArray) {
    print("printOdd() : ")
    for (i in numbers.indices) {
        if (numbers[i] % 2 ==0) {
            print(numbers[i])
            if (i < numbers.size - 1){
                print(", ")
            }
        }
    }
}