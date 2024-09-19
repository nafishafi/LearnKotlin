package `special-class-collection`

// fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.
// Membutuhkan nilai yang akan digunakan sebagai jumlah indeks untuk pemisah

fun main() {
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)

//  Bisa dimodifikasi untuk nilai string yang sudah diubah
    val chunkedTransform = word.chunked(3) {
        it.toString().lowercase()
    }

    println(chunkedTransform)
}