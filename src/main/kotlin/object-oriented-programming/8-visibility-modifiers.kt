package `object-oriented-programming`

// HAK AKSES
// Public, private, protected, internal

// Default public
// ==============
// PRIVATE
//class Animal6(
//    private val name: String,
//    private val weight: Double,
//    private val age: Int,
//    private val isMammal: Boolean
//)
//
//fun main() {
//    val dicodingCat = Animal6("Dicoding Miaw", 2.5, 2)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//}

// Untuk mengakses private harus menggunakan getter setter
class Animal6(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

fun main() {
    val dicodingCat = Animal6("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
}

// ===================
// Protected
// Hak akses protected digunakan ketika kita menginginkan sebuah anggota dari induk kelas dapat diakses hanya oleh kelas yang merupakan turunannya.
// Namun kita tidak dapat mengakses properti tersebut secara langsung dari luar hirarki kelasnya


//open class Animal(val name: String, protected val weight: Double)
//
//class Cat(pName: String, pWeight: Double) : Animal(pName, pWeight)
//
//
//fun main() {
//    val cat = Cat("Dicoding Miaw", 2.0)
//    println("Nama Kucing: ${cat.name}")
//    println("Berat Kucing: ${cat.weight}") // error: expecting a top level declaration
//}


// =====================
// Internal
// Hak akses ini membatasi suatu anggota untuk dapat diakses hanya pada satu modul.
//internal class Animal(val name: String)