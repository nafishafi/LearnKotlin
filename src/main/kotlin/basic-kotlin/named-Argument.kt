package com.dicoding.kotlin.`basic-kotlin`

//  Dengan ini, kita tak perlu lagi menghafal posisi dari sebuah parameter.
fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}
