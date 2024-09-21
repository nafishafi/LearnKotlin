package `kotlin-generics`

// Secara umum generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan.
// Dengan generic kita tidak perlu mendeklarasikan tipe parameter

val contributor = listOf<String>("jasoet", "alfian","nrohmen","dimas","widy") // String
val contributor2 = listOf("alfian","nrohmen","dimas","widy") // Auto
val contributor3 = listOf<String>() // Jika tidak memiliki nilai

val points = mapOf<String, Int>( "alfian" to 10 , "dimas" to 20 ) // 2 tipe parameter ketika menggunakan map
val points2 = mapOf("alfian" to 10, "dimas" to 20) // auto
