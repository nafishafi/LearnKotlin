package `special-class-collection`

// Drop
// fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan
// DIMULAI DARI INDEX PERTAMA

fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop) // 4,5,6

//  ===========
//  DROPLAST

//  Untuk memangkas dari index terakhir
    val dropLast = number.dropLast(3)

    println(dropLast)
}