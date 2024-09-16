package com.dicoding.kotlin.`basic-kotlin`

fun main() {
//    break = langsung berhenti
//    continue = di skip
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
    println("\n===========")
    val listOfInt2 = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt2) {
        if (i == null) break
        print(i)
    }
    println("\n===========")
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}