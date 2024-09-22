package concurrency
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// Contoh Coroutines Builder
// 1.launch -> fungsi ini digunakan untuk memulai sebuah coroutines yang tidak akan mengembalikan sebuah hasil
// 2, runBlocking -> Fungsi ini dibuat untuk menjembatani blocking code menjadi kode yang dapat ditangguhkan. runBlocking akan memblokir sebuah thread yang sedang berjalan hingga eksekusi coroutine selesai.
// 3. async -> fungsi ini digunakan untuk memulai sebuah coroutine yang akan mengembalikan sebuah hasil

// ==============
// async

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")

}

// Kita bisa lihat bahwa kode yang dijalankan di dalam async bisa selesai hampir 2 kali lebih cepat dibandingkan tanpa async!
