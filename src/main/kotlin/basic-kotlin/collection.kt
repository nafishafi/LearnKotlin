package com.dicoding.kotlin.`basic-kotlin`

fun main(){
    val integerList = listOf(4,2,1,3.4) // boleh sama (List)
    val integerSet = setOf(4,2,1,3.4) // nilai unik (Set)
    val capital = mapOf(               // key to value, key unik (TDK BOLEH SAMA) (MAP)
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(integerList[2])
    println(capital["Jakarta"]) // capital.getValue("Jakarta")
}