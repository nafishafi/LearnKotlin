package `object-oriented-programming`

import kotlin.math.PI
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

// Import digunakan untuk memanggil kelas yang telah kita buat di file lain
// seperti import kotlin.random.Random

// Kita juga dapat mengganti nama sebuah kelas, fungsi atau variabel yang kita import
// dengan menggunakan alias yang direpresentasikan dengan kata kunci as.

// import kotlin.math.PI
// import kotlin.math.cos as cosinus
// import kotlin.math.sqrt as akar

// Kita dapat mengimpor seluruh kelas, fungsi dan variabel yang berada pada suatu package dengan menggunakan tanda  * pada akhir package tersebut.
// import kotlin.math.*

fun main(){
    println(PI)
    println(cosinus(120.0))
    println(akar(9.0))
}