package `special-class-collection`

// Operasi untuk mengurutkan, memfilter data dll


fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// =============
// FILTER - FILTER NOT
    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(evenList)
    println(notEvenList)

//  =============
//  MAP
    val multipliedBy5 = numberList.map { it * 5 } // setiap item di list akan dikali 5
    println(multipliedBy5)

//  =============
//  COUNT
    println(numberList.count()) // Menampilkan jumlah item yang ada di dalamnya
    println(numberList.count {it % 3 == 0}) // Menampilkan jumlah item kelipatan 3

//  =============
//  find(), firstOrNull(), & lastOrNull()
    val firstOddNumber = numberList.find { it % 2 == 1 } // Mencari angka ganjil pertama dari list
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 } // Mencari angka ganjil ketiga dari list
//  Jika di dalam collection tidak ditemukan data yang sesuai, fungsi akan mengembalikan nilai null.

    println(firstOddNumber)
    println(firstOrNullNumber)

//  lastOrNull() -> Mencari item terakhir

//  ================
//  first() & last()

//  jika kita menambahkan kondisi padahal kondisi tersebut tidak terpenuhi, apa hasilnya? Exception!

//    val moreThan10 = numberList.first { it > 10 }
//    print(moreThan10)

//  ==============
//  sum()
    val total = numberList.sum()
    println(total)

//  ==============
//  sorted()

//  Secara default fungsi sorted() ini akan mengurutkan data secara ascending (baha-atas)
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}