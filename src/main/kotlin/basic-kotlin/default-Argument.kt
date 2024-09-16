package com.dicoding.kotlin.`basic-kotlin`

// Default Argument
// Isi Variabel default untuk parameter

fun getName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getName(first = "Dicoding")
    print(fullName)
}