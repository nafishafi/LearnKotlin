package `special-class-collection`

//  Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
//  Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.

fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
//  Secara otomatis fungsi setOf akan membuang angka yang sama
    println(integerSet)

//  Set yang memiliki nilai yang sama dan urutan yang berbeda akan tetap dianggap sama.
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    val setC = setOf(1, 5, 7)
    println(setA == setB)

//  Pengecekan apakah sebuah nilai ada di dalam Set
    println(5 in setA)

//  union = gabungan
//  intersect = irisan
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)
}