package oop

// Class -> blueprint
// Untuk membuat obejek

//  Class: sebuah blueprint yang terdapat properti dan fungsi di dalamnya.
//  Properties: karakteristik dari sebuah kelas, memiliki tipe data.
//  Methods: kemampuan atau aksi dari sebuah kelas.

// Membuat sebuah class
class Animal() {
    var name: String = "Kucing"
    var weight: Double = 3.2
    var age: Int = 2
    var isMamal: Boolean = true

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
//    Membuat sebuah objek
//    val nameOfObject = NameOfClass()
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, Mamalia: ${dicodingCat.isMamal}")
    dicodingCat.eat()
    dicodingCat.sleep()

    dicodingCat.name = "Roki"
    dicodingCat.weight = 6.0
    dicodingCat.age = 3
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, Mamalia: ${dicodingCat.isMamal}")
    dicodingCat.eat()
    dicodingCat.sleep()

}