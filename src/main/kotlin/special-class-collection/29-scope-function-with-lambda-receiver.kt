package `special-class-collection`

fun main() {
    val text = "Hello"
    val result = text.run {
//      Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
//      Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian.
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}