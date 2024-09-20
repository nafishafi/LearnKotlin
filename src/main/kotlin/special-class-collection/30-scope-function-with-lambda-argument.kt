package `special-class-collection`

// LET-IT
// Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe nullable.
fun main() {
    val messageLet: String? = null
    messageLet?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

//  Dengan menggunakan let maka akan mengurangi penggunaan safecall
    val messageLet2: String? = null
    val length = messageLet2?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

//  fungsi lainnya yaitu run dan elvis operator
    val messageElvis: String? = null
    messageElvis?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

//  ALSO
//    Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
//    Namun untuk konteks objeknya tersedia sebagai argumen (it).

//   noted: Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
    val textAlso = "Hello Kotlin"
    val result = textAlso.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}