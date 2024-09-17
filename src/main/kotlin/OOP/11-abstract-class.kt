package OOP

// Seperti namanya, abstract merupakan gambaran umum dari sebuah kelas.
// Ia tidak dapat direalisasikan dalam sebuah objek.

// Abstraction adalah konsep di mana Anda menyembunyikan detail tertentu dari implementasi suatu objek dan
// hanya menunjukkan fungsionalitas yang relevan atau penting bagi pengguna objek tersebut.

abstract class Animal9(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
    val animal = Animal9("dicoding animal", 2.6, 1, true)
}