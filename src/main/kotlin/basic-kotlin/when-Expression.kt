package com.dicoding.kotlin.`basic-kotlin`

// Seperti penggunaan switch
fun main() {
    val value = 20

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    val value2 = 7
    val stringOfValue = when (value2) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)

    val value3 = 7
    val stringOfValue2 = when (value3) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue2)

//    ====================
//    Memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

//    =====================
//     Cek Nilai di variabel
    val value4 =  27
    val ranges = 10..50

    when(value4){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }
}