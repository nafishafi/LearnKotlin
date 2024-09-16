package com.dicoding.kotlin.`basic-kotlin`
//    fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
//        return result
//    }
//    Nilai kembalian string
//    fun setUser(name: String, age: Int): String{
//        return "Your name is $name, and you $age years old"
//    }

//    SIMPLE / Pengembalian Nilai "return"
//    fun setUser(name: String, age: Int): String = "Your name is $name, and you $age years old"
    fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

//    Tanpa Pengembalian Nilai
//    fun printUser(name: String): Unit {
//        print("Your name is $name")
//    }
    fun printUser(name: String) {
        print("Your name is $name")
    }

fun main(){
    val user = setUser("Nafis", 19)
    println(user)

    printUser("Nafis")
}