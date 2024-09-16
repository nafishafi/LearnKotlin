package com.dicoding.kotlin.`basic-kotlin`

fun main(){
    val listOfInt = arrayOf(1,2,3,5)
    println(listOfInt[2])

    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }

}