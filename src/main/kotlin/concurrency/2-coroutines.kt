package concurrency

// Coroutines bukanlah bagian dari bahasa Kotlin
// Coroutines hanyalah library lain yang disediakan oleh JetBrains.

// Untuk itu, agar bisa menggunakannya Anda perlu menambahkan dependensi berikut pada build.gradle.kts

// dependencies {
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
//}
import kotlinx.coroutines.*

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}

// Fungsi delay(1000L) di dalam launch digunakan untuk menunda kode berikutnya selama 1 detik.
// Sehingga Hello akan dijalankan terlebih dahulu
// mSetelah 1 detik, baru fungsi println("Coroutines!") akan dijalankan.
// Sedangkan kode delay(2000L) digunakan untuk menunda selama 2 detik sebelum JVM berakhir.