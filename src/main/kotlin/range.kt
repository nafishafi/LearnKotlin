package com.dicoding.kotlin

fun main() {
//     step dapat diatur (Jarak antar angka)
    val rangeInt = 1..10
    println(rangeInt.step)

    val rangeInt2 = 1..10
    println(rangeInt2.step)

//    val rangeInt = 1.rangeTo(10)
//    val downInt = 10.downTo(1) // TERBALIK
//    =======
//    CEK VALUE
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    val tenToOne2 = 10.downTo(1)
    if (11 !in tenToOne2) {
        println("No value 11 in Range ")
    }

    val rangeChar = 'A'.rangeTo('F')
    for (i in rangeChar){
        println(i)
    }
}