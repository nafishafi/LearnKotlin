package oop

// Kotlin memungkinkan kita untuk menambahkan sebuah fungsi baru pada sebuah kelas tanpa harus
// mewarisi kelas tersebut.

//class NewInt : Int(){  // error
//    fun printInt(){
//        println("value $this")
//    }
//}



fun main() {
    10.printInt()
    println(10.plusThree())
    println(10.slice)
}

// Extension Functions
fun Int.printInt() {
    println("value $this")
}
fun Int.plusThree(): Int {

    return this + 3
}
// Extension Properties
val Int.slice: Int
    get() = this / 2

// Infix Function -> cara lain pemanggilan fungsi
// NO
//fun Int.sum(value: Int): Int {
//    return this + value
//}

// YES
infix fun Int.sum(value: Int): Int {
    return this + value
}
//fun main() {
////    val result = 5.sum(3)
//    val result = 5 sum 3 // Menggunakan Infix Function
//    println(result)
//}


// ================
// 1.Infix function harus merupakan sebuah member function atau extension function.
// 2.Harus memiliki satu parameter saja.
// 3.Parameter tidak boleh berupa generic dan tidak memiliki nilai default.


//class MyHero {
//    infix fun addHero(s: String) { /*...*/ }
//
//    fun build() {
//        this addHero "Superman"   // Correct
//        addHero("Spidermen")       // Correct
//        //  addHero "Ironman"        // Incorrect: the receiver must be specified
//    }
//}