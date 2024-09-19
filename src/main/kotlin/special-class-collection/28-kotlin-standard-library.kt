package `special-class-collection`

// Lambda receiver (This)
// Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply
// Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this.
// Misalnya seperti penggunaan fungsi apply berikut.

// Cara ini memiliki kekurangan, yaitu kita tidak dapat membedakan objek receiver dengan objek yang berada
// dari luar lingkup fungsi tersebut.

//fun main() {
//    val buildString = StringBuilder().apply {
//        append("Hello ")
//        append("Kotlin ")
//    }
//    println(buildString)
//
//}

// ============
// Lambda argument (it)

// Selanjutnya, fungsi yang menggunakan lambda argument untuk mengakses konteks
// dari sebuah objek adalah fungsi let dan also.

fun main() {
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

//  Secara default, nama dari argumen tersebut adalah it, tetapi kita dapat mengubahnya seperti berikut.

    val text2 = "Hello"
    text2.let { value ->
        val message = "$value Kotlin"
        println(message)
    }
}


// ====================
// Fungsi
//// apply: Menginisialisasi objek dan mengatur propertinya, kemudian mengembalikan objek tersebut
//val personApply = Person("John", 25).apply {
//    println("apply: Initializing $name, age $age")
//}
//
//// also: Melakukan tindakan tambahan pada objek dan mengembalikan objek tersebut
//val personAlso = Person("Jane", 30).also {
//    println("also: Initializing ${it.name}, age ${it.age}")
//}
//
//// let: Melakukan operasi pada objek dan mengembalikan hasil operasi tersebut
//val personLet = Person("Bob", 22).let {
//    println("let: Initializing ${it.name}, age ${it.age}")
//    "Result: ${it.name} is ${it.age} years old" // return value
//}
//println("let result: $personLet")
//
//// run: Menjalankan blok kode pada objek dan mengembalikan hasil blok kode tersebut
//val personRun = Person("Alice", 28).run {
//    println("run: Initializing $name, age $age")
//    "Result: $name is $age years old" // return value
//}
//println("run result: $personRun")
//
//// with: Menggunakan objek sebagai receiver untuk blok kode dan mengembalikan hasil blok kode tersebut
//val personWithResult = with(Person("Charlie", 35)) {
//    println("with: Initializing $name, age $age")
//    "Result: $name is $age years old" // return value
//}