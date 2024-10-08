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

//  With
//  Fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian.
    println("================")
    val message = "Hello Kotlin!"
    val resultWith = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
    val resultWith2 = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(resultWith2)

//  Apply
//  Fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this)

//  SEBELUM
    println("================")
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())

//  SESUDAH
    println("================")
    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Apply!")
    }

    println(messageApply.toString())

}