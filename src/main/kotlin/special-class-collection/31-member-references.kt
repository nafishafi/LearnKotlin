package `special-class-collection`

// Property References
var messageProperty = "Kotlin"

fun main() {
//  Function References
//  Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)

//  Selain itu, kita juga bisa mereferensikan sebuah extensions function.
//  Caranya dengan ikut menyertakan objek yang menjadi receivernya sebelum operator ::
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(Int::isEvenNumber)
//
//    println(evenNumbers)

//    fun Int.isEvenNumber() = this % 2 == 0

//   =============
//    Property References
//
//    Dengan Operator (::), kita bisa mengakses apa yang menjadi bagian dari
//    properti tersebut seperti nama, fungsi setter getter, dll.
    println(::messageProperty.name)
    println(::messageProperty.get())

    ::messageProperty.set("Kotlin Academy")

    println(::messageProperty.get())
}

// Reflection mekanism
    val sum: (Int, Int) -> Int = ::count
    fun count(valueA: Int, valueB
    : Int): Int {
        return valueA + valueB
    }

// Function References
fun isEvenNumber(number: Int) = number % 2 == 0

