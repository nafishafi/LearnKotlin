package `special-class-collection`

// TAKE
// Fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection.
// (MENGAMBIL ITEM)

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

//  ================
//  TAKE LAST
//  Mengambil dari akhir
    val takeLast = total.takeLast(3)

    println(takeLast)
}