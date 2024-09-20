package `special-class-collection`

// Recursion/Recursive function merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk menyederhanakan pemecahan
// masalah yang umumnya diselesaikan dengan cara yang kompleks.

// Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri.
// Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali.

//  Menghitung faktorial dari nilai yang kita tentukan
fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

//  Dengan recursive kita bisa menentukan nilai akhir tersebut dengan cara yang lebih sederhana.
fun factorialRecursive(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

// Ketika kita menjalankan fungsi di atas, program akan menciptakan tumpukan frame dengan jumlah berdasarkan nilai n di mana setiap frame akan mengkonsumsi memori.
// Ini bisa jadi masalah dalam penerapannya. Contoh, jika kita memasukkan argumen dengan nilai besar ketika ingin menggunakannya


// =============
// Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan.
tailrec fun factorialTailrec(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorialTailrec(n - 1, newResult)
    }
}

fun main() {
    println("Factorial 9999 is: ${factorialTailrec(9999)}")
}
// test
