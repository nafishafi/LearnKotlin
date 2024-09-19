package `special-class-collection`

// Digunakan ketika fungsi memiliki parameter yang sama
// (Int, Int) -> String

// typealias cocok digunakan ketika kita mempunyai sebuah function type yang panjang.
typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    println(sum(20, 30))

//  Cara menggunakan instance nya
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

//  Atau tanpa invoke
    val sumResult2 = sum(10, 10)
    val multiplyResult2 = multiply(20, 20)

    println(sumResult)
    println(sumResult2)
    println(multiplyResult)
    println(multiplyResult2)

//  =============
//  Kita juga bisa menandai function type sebagai nullable dengan
//  menempatkannya di dalam tanda kurung dan diakhiri dengan safe call

//    typealias Arithmetic = ((Int, Int) -> Int)?
//
//    fun main() {
//        val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
//
//        val sumResult = sum?.invoke(10, 10)
//
//        println(sumResult)
//    }
}