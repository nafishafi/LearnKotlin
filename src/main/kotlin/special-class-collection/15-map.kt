package `special-class-collection`

//  Map, yakni sebuah collection yang dapat menyimpan data dengan format key-value.
//  KEY-VALUE

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
//  ATAU
    println(capital.getValue("London"))

//  Saat menggunakan simbol [ ] atau yang kita kenal dengan indexing, konsol akan menampilkan hasil null saat key yang dicari tidak ada di dalam Map,
//  sedangkan saat kita menggunakan getValue(), konsol akan memberikan sebuah Exception.

    println(capital["Amsterdam"])  // Output: null
//    println(capital.getValue("Amsterdam"))  // Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.

// Kita dapat menampilkan key apa saja yang ada di dalam Map dengan menggunakan fungsi keys()
    val mapKeys = capital.keys
    println(mapKeys)

//  Lalu, untuk mengetahui nilai apa saja yang ada di dalam Map, kita bisa menggunakan fungsi values().
    val mapValues = capital.values
    println(mapValues)

//  Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalah mutable.
//  TETAPI TIDAK DISARANKAN DIGUNAKAN TERUS MENERUS
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)

}