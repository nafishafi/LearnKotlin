package `special-class-collection`

// Lebih ringkas lagi

// ===========
// Sebelum

//fun main(){
//    printMessage("Dicoding", message)
//}
//
//val message8 = { name: String ->
//    "Hello $name"
//}
//
//fun printMessage(name: String, message: (String) -> String) {
//    print(message(name))
//}

// ==============
// Sesudah

//fun main(){
//    printMessage("Dicoding") { name: String ->
//        "Hello $name"
//    }
//}
//
//fun printMessage(name: String, message: (String) -> String) {
//    print(message(name))
//}

// =============
// Inline Function

// Perhatikan kode dibawah dicetak 2 kali println

fun main() {
    printResult(10){ value ->
        value + value
    }
    printResult(20){ value ->
        value + value
    }
}

//fun printResult(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
//}

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}