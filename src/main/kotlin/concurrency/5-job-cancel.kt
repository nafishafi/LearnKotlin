package concurrency
import kotlinx.coroutines.*

// Hanya job yang sedang aktif yang dapat dibatalkan.

//fun main() = runBlocking {
//    val job = launch {
//        delay(5000)
//        println("Start new job!")
//    }
//
//    delay(2000)
//    job.cancel()
//    println("Cancelling job...")
//    if (job.isCancelled){
//        println("Job is cancelled")
//    }
//}

// Kode di atas menggambarkan sebuah job membutuhkan waktu 5 detik untuk dijalankan.
// Namun ketika mencapai waktu 2 detik, job tersebut telah dibatalkan.

// =================
// Kita juga bisa menambahkan parameter terhadap fungsi cancel(), yaitu parameter cause yang bisa digunakan untuk memberitahu kenapa sebuah job dibatalkan.

// job.cancel(cause = CancellationException("time is up!"))

// CancellationException akan mengirimkan nilainya sebagai pengecualian dari job tersebut. Kita pun bisa mengakses nilai tersebut dengan fungsi getCancellationException
// Karena getCancellationException masih tahap eksperimen, Anda perlu menambahkan anotasi @InternalCoroutinesApi

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}

