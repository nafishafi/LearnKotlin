package `special-class-collection`

// List tidak bisa di manipulasi seperti add, remove, change data didalamnya
// Jika ingin list yang bisa di manipulasi maka gunakan mutableList
// Pada Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.


fun main() {
    val anyList2 = mutableListOf('a', "Kotlin", 3, true)

    anyList2.add('d') // menambah item di akhir list
    anyList2.add(1, "love") // menambah item pada indeks ke-1
    anyList2[3] = false // mengubah nilai item pada indeks ke-3
    anyList2.removeAt(0) // menghapus item pada indeks ke-0

    println(anyList2)
}