package concurrency

// fungsi async akan mengembalikan nilai deferred yang berupa hasil atau exception.
// Deferred adalah nilai tangguhan yang dihasilkan dari proses coroutines.
// Nilai ini nantinya bisa kita kelola sesuai dengan kebutuhan.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}

// capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.