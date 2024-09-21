package `special-class-collection`


data class DataUser5(val name : String, val address : String)

fun main() {
//    val dicoding = DataUser5("Dicoding Indonesia", "Bandung")
//    println(dicoding)
    val total = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val result1 = total.distinct()
    val result2 = result1.slice(1..3)
    println(result2)
}