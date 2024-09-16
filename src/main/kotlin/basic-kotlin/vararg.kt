package com.dicoding.kotlin.`basic-kotlin`

// Variabel Argument (Vararg)
//Dengan  vararg sebuah fungsi dapat memiliki jumlah parameter
// berdasarkan jumlah argumen yang kita masukkan ketika fungsi tersebut dipanggil.

//fun sumNumbers(vararg number: Int, vararg number2: Int) -> ERROR
//fun sets(name: String, vararg number: Int): Int -> AMAN (diakhir)
//Jika ingin menggunakan vararg diawal maka harus menggunakan named parameter

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}
fun getNumberSize(vararg number: Int): Int {
    return number.size
}

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    val number2 = getNumberSize(10, 20, 30, 40)
    println(number2)
}

// ================
// Array in function
//    fun main() {
//        val number = arrayOf(10, 20, 30, 40)
//        sets(number)
//    }
//
//    fun sets(number: Array<Int>) {
//        ...
//    }

// ====================
// Array + vararg
//    fun main() {
//        val number = intArrayOf(10, 20, 30, 40)
//        sets(10, 20, 20, *number , 10)
//    }
//
//    fun sets(vararg number: Int): Int {
//        ...
//    }