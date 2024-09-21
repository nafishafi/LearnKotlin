package `kotlin-generics`

// Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi yang berhubungan dengan List.
// Misalnya, list yang dapat digunakan untuk berbagai tipe dan tidak terpaku pada tipe tertentu.

// Cara mendeklarasikannya sedikit berbeda dengan kelas generic.
//fun <T> run(): T {
//    /*...*/
//}

// Contoh penerapan fungsi generic bisa kita lihat pada deklarasi fungsi slice yang
// merupakan extensions function dari kelas List
interface List2<T>{
    operator fun get(index: Int) : T
}

//public fun <T> List2<T>.slice(indices: Iterable<Int>): List<T> {
//    /*...*/
//}

// Tipe parameter pada fungsi slice() digunakan sebagai receiver dan return type.
fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))

//  Seperti yang telah disebutkan sebelumnya, jika semua nilai yang berada di dalamnya memiliki tipe yang sama, kita bisa menyederhanakan.
//  Caranya, hapus tipe parameter dalam pemanggilan slice<Int>
    val numbers2 = (1..100).toList()
    print(numbers2.slice(1..10))
}