package OOP


fun main() {
    val value: Int? = null

    println(value.slice)
}
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

// elvis operator
//val Int?.slice: Int
//    get() = this?.div(2) ?: 0

// ==========
// operator safe call setiap kali extension tersebut dipanggil
//fun main() {
//    val value: Int? = null
//    val value1: Int? = null
//
//    println(value?.slice)
//    println(value1?.slice)
//}
//
//val Int.slice: Int
//    get() = this.div(2)
//

// =================
// Kita juga bisa menentukan nilai dari receiver object jika bernilai null.
// Sehingga kita tidak perlu lagi menggunakan operator safe call
//fun main() {
//    val value: Int? = null
//    val value1: Int? = null
//
//    println(value.slice)
//    println(value1.slice)
//}
//
//val Int?.slice: Int
//    get() = this?.div(2) ?: 0