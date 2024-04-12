package `20240412`

fun main() {
    val mutableList = mutableListOf<String>();

    for (i in 0..4){
        print("문자를 입력해주세요 : ")
        var str = readln()
        mutableList.add(str)
    }
    println(mutableList)

    val immutableList = listOf('a', 'b', 'c', 'd', 'e');
    println(immutableList)
}