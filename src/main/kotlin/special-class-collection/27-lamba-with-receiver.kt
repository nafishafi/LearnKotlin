package `special-class-collection`

fun main() {
//     SEBELUM
//    val message = buildString()

//     SESUDAH

    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

// ==============
// SEBELUM
//fun buildString(): String {
//    val stringBuilder = StringBuilder()
//    stringBuilder.append("Hello ")
//    stringBuilder.append("from ")
//    stringBuilder.append("lambda")
//    return stringBuilder.toString()
//}

// Kode di atas merupakan contoh kode StringBuilder yang digunakan untuk menambahkan kata satu per satu.
// Jika dilihat kode ini cukup panjang tidak fleksibel.
// Jika Anda ingin membuat menambahkan kata baru harus di dalam kode tersebut dan mengulang-ulang kata stringBuilder.

// ===============
// SESUDAH
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}