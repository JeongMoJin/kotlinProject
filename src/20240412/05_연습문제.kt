package `20240412`

class Book(code: Int, title: String, author: String, stock: Int) {
    var code: Int = 0;
    lateinit var title: String;
    lateinit var author: String;
    var stock: Int = 0;
    override fun toString(): String {
        return "Book(code=$code, stock=$stock, title='$title', author='$author')"
    }
}

class BookManager {
    // Book의 객체를 저장할 리스트
    private val books = mutableListOf<Book>()

    fun insertBook() {
        /* 책 등록 */
        println("등록할 책의 정보를 입력해 주세요.")

        print("코드: ")
        val code = readln().toInt();
        print("제목: ")
        val title = readln()
        print("작가: ")
        val author = readln()
        print("재고: ")
        val stock = readln().toInt();
        books.add(Book(code, title, author, stock))
        println(books.size)
        println("책이 등록되었습니다.")
    }

    fun searchByKeyWord() {
        /* 키워드로 책 검색 */
        println("검색할 책의 제목을 입력해 주세요.")
        print("제목: ")
        val searchTitle = readln()
        for (i in 0..books.size) {
            if (books[i] != null) {
                if (books[i].title == searchTitle) {
                    println("검색한 책의 정보는 아래와 같습니다.")
                }
            } else {
                println("검색된 책이 없습니다.")
            }
        }
    }

    fun printAll() {
        /* 전체 목록 출력 */
    }

    private fun searchBookByCode(code: Int): Int? {
        /* 코드로 책 찾기 */
        var book: Book? = null
        for (i in 0..books.size) {
            if (books[i] != null) {
                if (books[i]!!.code == code) {
//                    Int =
                }
            }
        }
        return 0
    }

    fun rentBook() {
        /* 책 대여 */
        println("대여할 책의 코드를 입력해 주세요.")

        print("코드: ")

        print("대여 권수: ")


        println("입력하신 코드의 책은 없습니다.")


//        println("재고가 ${book.stock}권이여서 대여할 수 없습니다")


//        println("${stock}권이 대여되었습니다.")
    }

    fun returnBook() {
        /* 책 반납 */
        println("반납할 책의 코드를 입력해 주세요.")
        print("코드: ")

        print("재고: ")


        println("입력하신 코드의 책은 없습니다.")


//        println("${stock}권이 반납되었습니다.")
    }
}
fun main() {
    val manager = BookManager()
    while (true) {
        printMenu()
        print("선택: ")
        val choice: Int = readln().toInt()
        when (choice) {
            1 -> manager.insertBook()
            2 -> manager.searchByKeyWord()
            3 -> manager.rentBook()
            4 -> manager.returnBook()
            5 -> manager.printAll()
            6 -> {
                println("종료합니다.")
                return
            }

            else -> println("잘못누르셨습니다.\n다시선택해주세요.")
        }
    }
}
fun printMenu() {
    println("============Menu============")
    println("1. 책 등록")
    println("2. 책 검색")
    println("3. 책 대여")
    println("4. 책 반납")
    println("5. 책 전체출력")
    println("6. 종료")
    println()
}