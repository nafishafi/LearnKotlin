package `kotlin-generics`

// Untuk menentukkan batasan tersebut, Anda dapat menambahkan tanda titik dua (:) setelah tipe parameter,
// kemudian diikuti oleh tipe yang akan dijadikan batasan.

fun main() {
//    val numbers = ListNumber<Long>()
//    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds
}

//class ListNumber<T : Number> : List<T>{
//    override fun get(index: Int): T {
//        /* .. */
//    }
//}

// Maksud dari tipe Number ini berarti, Integer, Long, Double, dan tipe angka lainnya.

// ================
// Extension class List

//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5)
//    numbers.sumNumber()
//    val names = listOf("dicoding", "academy")
//    names.sumNumber() // error : inferred type String is not a subtype of Number
//}
//
//fun <T : Number> List<T>.sumNumber() : T {
//    /* .. */
//}

// Dalam kode di atas, kita tidak bisa memanggil sumNumber untuk list dengan tipe data String seperti names.