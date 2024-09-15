package com.dicoding.kotlin

fun main() {
    var counter = 1

    println("While")
    while (counter <= 7){
        println("$counter Hello, World!")
        counter++
    }

    println("\nDo While")
    var counter2 = 1
    do {
        println("$counter2 Hello, World!")
        counter2++
    } while (counter2 <= 7)
}