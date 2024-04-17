package `20240417`

import `20240416`.Cat

class Dog {
    companion object {
        var name: String = "None"
        fun printName() {
            println("Dog 이름은 ${name}입니다.")
        }
    }
    fun walk() {
        println("Dog가 뛰어갑니다.")
    }
}

fun main() {
    Cat.name = "mikey"
    Cat.printName() // Cat의 이름은 mikey입니다.

    // companion object 안의 코드 사용하기
    Dog.name = "Linda"
    Dog.printName() // Dog 이름은 Linda입니다.
//    Dog.walk() // companion object 밖에 선언된 메서드는 사용하지 못함

    // companion object 밖에 코드 사용하기
    val dog = Dog()
    dog.walk() // Dog가 뛰어갑니다.
}