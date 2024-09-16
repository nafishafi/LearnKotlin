package com.dicoding.kotlin.`basic-kotlin`

fun main(){
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    println(intArray[2])
//  ====================
//    Array yang hanya bisa dimasukkan nilai dengan tipe data Int, dll
//    intArrayOf() : IntArray
//    booleanArrayOf() : BooleanArray
//    charArrayOf() : CharArray
//    longArrayOf() : LongArray
//    shortArrayOf() : ShortArray
//    byteArrayOf() : ByteArray

//    mix Array
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)
    println(mixArray[4])
}