package com.dicoding.kotlin

fun main(){
//    tipe data number:
//    1. Int (32 bit)
//    2. Long (64 bit)
//    3. Short (16 bit)
//    4. Byte (8 bit)
//    5. Double (64 bit)
//    6. Float (32 bit)
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)
//  =====================
//  KONVERSI
//    toByte(): Byte
//    toShort(): Short
//    toInt(): Int
//    toLong(): Long
//    toFloat(): Float
//    toDouble(): Double
//    toChar(): Char
    val stringNumber = "23"
    val intNumber = 3

    println(intNumber + stringNumber.toInt())

//  =========================
//  Readable
//  (menggunakan tanda underscores)
    val readableNumber = 1_000_000
    print(readableNumber)

}