package `special-class-collection`

// Langsung saja kita mulai dengan fungsi fold, kita bisa dengan mudah melakukan perhitungan setiap nilai yang
// berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold()

fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

//  Fungsi fold() memerlukan 2 (dua) argumen yaitu nilai awal untuk perhitungan dan lambda expression yang nilai
//  kembaliannya digunakan untuk menentukan nilai awal selanjutnya.
//  Nah, di dalam lambda expression nya juga terdapat 2 (dua) argumen. Yaitu, argumen current yang
//  merepresentasikan nilai awal dan argumen item merepresentasikan masing-masing item yang berada pada numbers.

//  ==========
//    FOLD RIGHT
//    Melakukan iterasi dari indeks terakhir
//     Item berada pada posisi kanan dan current posisi ke 2
    println("=====================\n")
    val fold2 = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold2")
}