package `special-class-collection`

// Jika kita menginginkan tanpa adanya duplikasi Class dalam penggunaanya
// Singleton merupakan pattern yang berguna untuk memastikan suatu object hanya memiliki satu instance dengan satu titik akses global.

object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}

fun main() {
    CentralLibrary.borrowBookById(21)
}