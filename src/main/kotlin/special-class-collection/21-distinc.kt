package `special-class-collection`

// Fungsi distinct() digunakan untuk menghapus elemen-elemen yang duplikat
// dalam sebuah list dan hanya menyisakan elemen-elemen yang unik (tidak berulang).

/*
fun main() {
    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)
}
 */

//  ================
//   Fungsi distinct() bisa langsung dipanggil dari objek collection.
//   Kita juga bisa menggunakannya pada collection dengan tipe parameter seperti data class.

/*
data class Item(val key: String, val value: Any)

fun main(args: Array<String>) {
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    /*
    output:
        1 with value Kotlin
        2 with value is
        3 with value Awesome
    */
}

 */

// Misal kita ingin menyaring item yang memiliki panjang sama dg distincBy (menghapus elemen yg sama)

fun main() {
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct = text.distinctBy {
        it.length
    }

    println(distinct)
}

// Note: Yang perlu diperhatikan, fungsi distinct() tidak dapat digunakan pada object Map Collection.
