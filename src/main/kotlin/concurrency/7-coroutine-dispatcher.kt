package concurrency
import kotlinx.coroutines.*

// kita harus mengetahui thread mana yang akan digunakan untuk menjalankan dan melanjutkan sebuah coroutine.
// Untuk menentukannya kita membutuhkan sebuah base class bernama CoroutineDispatcher

// 1. Dispatchers.Default
// 2. Dispatchers.IO
// 3. Dispatchers.Unconfined

// Dispatchers.Unconfined
// Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan.

//fun main() = runBlocking<Unit> {
//    launch(Dispatchers.Unconfined) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}

// Artinya, coroutine telah dimulai dari main thread, kemudian tertunda oleh fungsi delay selama 1 detik. Setelah itu, coroutine dilanjutkan kembali pada thread DefaultExecutor.

// Ada beberapa builder yang dapat digunakan untuk menentukan thread yang dibutuhkan:
// 1. Single Thread Context -> Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan.
// -> newSingleThreadContext()

//fun main() = runBlocking<Unit> {
//    val dispatcher = newSingleThreadContext("myThread")
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//} // Walaupun sudah menjalankan fungsi delay, coroutine akan tetap berjalan pada myThread

// 2. Thread Pool -> Thread Pool adalah sebuah dispatcher yang memiliki kumpulan thread. Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia pada kumpulan tersebut.

fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}
