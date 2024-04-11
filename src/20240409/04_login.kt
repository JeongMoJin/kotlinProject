package `20240409`


fun login(id:String, password:String) : Boolean {
    return id == "admin" && password == "1234"
}
fun logout(id:String) {
    println("$id 아이디가 로그아웃 되었습니다.")
}

fun main() {
    print("아이디를 입력해 주세요. >> ")
    val id = readln()
    print("비밀번호를 입력해주세요. >> ")
    val password = readln()

    val result = login(id, password) // true대신 login() 호출;
    if (result) {
        println("로그인 되었습니다.")
        logout(id)
        // logout() 호출;
    } else {
        println("id 또는 password가 올바르지 않습니다.")
    }
}