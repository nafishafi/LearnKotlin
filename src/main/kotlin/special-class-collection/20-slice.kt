package `special-class-collection`

// Slice untuk filter
// Fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan untuk menentukan posisi pertama
// dan terakhir yang akan disaring.

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)
    val sliceStep = total.slice(3..6 step 2)
    val index = listOf(2, 3, 5, 8)
    val sliceCollection = total.slice(index) // Nilai di index adalah 2, 3, 5, dan 8, yang berarti elemen pada posisi ke-2, ke-3, ke-5, dan ke-8 dalam daftar total akan diambil (posisi dihitung mulai dari 0

    println(slice)
    println(sliceStep)
    println(sliceCollection)
//  test
}