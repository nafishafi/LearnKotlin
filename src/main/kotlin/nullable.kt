package com.dicoding.kotlin

fun main(){
    var nama:String? = null
    println("Hello $nama")
    println(nama?.length)

    var string: String? = "Dicoding"
    if(string != null) { // smart cast
        println(string.length) // It works now!
    }
}