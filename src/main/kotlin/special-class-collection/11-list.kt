package `special-class-collection`

// Dengan List kita dapat menyimpan banyak data menjadi satu objek dan bermacam-macam tipe
// Int, String, Boolean, dll

val numberList = listOf(1, 2, 3, 4 , 5) // tipe integer
val charList = listOf('a', 'b', 'c') // tipe char
val anyList = listOf('a', "Kotlin", 3, true) // tipe any

//Bahkan kita pun bisa memasukkan sebuah data class ke dalam List tersebut.
//val anyList = listOf('a', "Kotlin", 3, true, User())

fun main() {
    println(anyList[2])
}