package concurrency

import kotlinx.coroutines.*

// Sebagai developer, tentunya kita menginginkan tetap bisa mengakses fungsi yang sudah dijalankan.
// Misalnya, ketika kita ingin membatalkan tugasnya atau memberikan instruksi tambahan ketika fungsi tersebut telah mencapai kondisi tertentu.
// Untuk bisa melakukannya, Anda perlu memahami tentang Job dan Deferred pada coroutines.

// 3 Properti Job:
// 1. isActive = Sebuah properti yang menunjukkan ketika sebuah job sedang aktif.
// 2. isCompleted = Sebuah properti yang menunjukkan ketika sebuah job telah selesai.
// 3. isCancelled = Sebuah properti yang menunjukkan ketika sebuah job telah dibatalkan.

// State pada Job:
// New = Keadaan di mana sebuah job telah diinisialisasi namun belum pernah dijalankan.
// Active = Sebuah job akan memiliki status aktif ketika ia sedang berjalan. Dalam hal ini, job yang sedang ditangguhkan (suspended job) juga termasuk ke dalam job yang aktif.
// Completed = Ketika job sudah tidak berjalan lagi. Ini berlaku untuk job yang berakhir secara normal, dibatalkan, ataupun karena suatu pengecualian.
// Cancelling = Suatu kondisi ketika fungsi cancel() dipanggil pada job yang sedang aktif dan memerlukan waktu untuk pembatalan tersebut selesai.
// Cancelled = Keadaan yang dimiliki oleh sebuah job yang sudah berhasil dibatalkan. Perlu diketahui bahwa job yang dibatalkan juga dapat dianggap sebagai Completed job.


////menggunakan launch():
//fun main() = runBlocking {
//    val job = launch {
//        // Do background task here
//    }
//}
//
////menggunakan Job():
//fun main() = runBlocking {
//    val job = Job()
//}

// Setelah diinisialisasikan, job akan memiliki state New dan akan langsung dijalankan.
// Jika Anda ingin membuat sebuah job tanpa langsung menjalankannya, Anda bisa memanfaatkan CoroutineStart.LAZY

//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        TODO("Not implemented yet!")
//    }
//}

// ===========
// Menjalankan Job

// fungsi start()
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")
}

// Atau bisa juga dengan menggunakan fungsi join()
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Start new job!")
//    }
//
//    job.join()
//    println("Other task")
//}

// Perbedaan dari keduanya adalah bahwa yang start() akan memulai job tanpa harus menunggu job tersebut selesai,
// sedangkan join() akan menunda eksekusi sampai job selesai.


// Setelah dijalankan,  job akan memiliki state Active.