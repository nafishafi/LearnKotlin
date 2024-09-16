package com.dicoding.kotlin.`basic-kotlin`

fun main() {
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }
    println("\n=======\n")
    val ranges2 = 1.rangeTo(10) step 3
    for (i in ranges2 ){
        println("value is $i!")
    }
    println("\n=======\n")
    val ranges3 = 1.rangeTo(10) step 3
    for ((index, value) in ranges3.withIndex()) {
        println("value $value with index $index")
    }
    println("\n=======\n")
    val ranges4 = 1.rangeTo(10) step 3
    ranges4.forEach { value ->
        println("value is $value!")
    }
}