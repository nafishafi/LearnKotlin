package `special-class-collection`

//fun main() {
//    println(message("Nafis"))
//
////  Contoh simpel dari lambda tanpa mendeklarasikan tipe data nya
//    val pesan = { println("Hello From Lambda") }
//    pesan()
//
////  Penambahan parameter
//    printMessage("Hello From Lambda")
//
////  Lambda pengembalian nilai
//    val length = messageLength("Hello From lambda")
//    println("Message length $length")
//}

// Regular Function
fun getMessage(name: String): String {
    return "Hello $name"
}

// Function with lambda
val message :(String) -> String = { name: String ->
    "Hello $name"
}

// ============
// Jika ingin menambahkan sebuah parameter pada fungsi lambda
val printMessage = { message: String -> println(message) }

// ============
// Lambda dengan pengembalian nilai
val messageLength = { message: String -> message.length } // Kompiler akan mengembalikan nilai berdasarkan expression atau statement di baris terakhir di dalam body.

// ============
// Perulangan -> ForEach
fun main() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }

//  Mendapatkan Index tiap nilai
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

//  Sebenarnya ini merupakan sebuah aturan di mana ketika argumen dari sebuah lambda expression tidak digunakan,
//  kita disarankan agar mengubahnya menjadi _ untuk menggantikan nama dari argumen tersebut.
//  Value -> _
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}

