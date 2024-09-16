package com.dicoding.kotlin.`basic-kotlin`

fun main() {
    val text = "Nafis"
    val firstChar = text[3]

    println("The 4th character of the $text is $firstChar")

//  output : The 4th character of the Nafis is i

// ==============
//    Indexing
    val text2  = "Kotlin"
    for (char in text){
        print("$char ")
    }
        println()

//  ==========================
//     Escaped String
    val statement = "Kotlin is \"Awesome!\"" // menambahkan petik 2 di string
    println(statement)

//    \t: menambah tab ke dalam teks.
//    \n: membuat baris baru di dalam teks.
//    \’: menambah karakter single quote kedalam teks.
//    \”: menambah karakter double quote kedalam teks.
//    \\: menambah karakter backslash kedalam teks.

//  =======================
//    Unicode
    val unicode = "Unicode test: \u00A9"
    println(unicode)

//  ======================
//    Raw String

//    val line = "Line 1\n" +
//            "Line 2\n" +
//            "Line 3\n" +
//            "Line 4\n"

    val line = """ 
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent() // Petik 3

    println(line)

//  ==============
//    String Template ($nama / penyisipan)
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}