package com.dicoding.kotlin

fun main(){
    var nama:String? = null
    println("Hello $nama")
    println(nama?.length)

    var string: String? = "Dicoding"
    if(string != null) { // smart cast
        println(string.length) // It works now!
    }

//    ============
//    Safe Calls Operator
    val text: String? = null
    println(text?.length)
//    ============
//    Elvis Operator
//    (condition ? then : else)
    val text2: String? = null
    val textLength = text2?.length ?: 7
    println(textLength)
//    Sama Seperti dibawah (IF)
//    val textLength = if (text != null) text.length else 7

//    =====================
//     non-null ASSERTION kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable.
//     Namun, penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null.
    val text3: String? = null
    val textLength2 = text3!!.length // ready to go ???
}