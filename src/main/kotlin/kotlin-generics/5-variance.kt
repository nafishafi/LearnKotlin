package `kotlin-generics`

// Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe yang sama dan tipe argumen yang berbeda saling berkaitan satu sama lain.
abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
}

// Variabel car dan motorcycle merupakan subtipe dari Vehicle sehingga kita bisa melakukan assignment antara dua variabel t

// ==============
// Masukkan salah satu kelas yang merupakan subtipe dari kelas Vehicle
//fun main() {
//    val carList = listOf(Car(100) , Car(120))
//    val vehicleList = carList
//}

// Dari contoh di atas, kita melihat variance menggambarkan keterkaitan antara carList dan vehicleList di mana Car merupakan subtipe dari Vehicle.


// ============
// Covariant
//interface List<out E> : Collection<E> {
//    operator fun get(index: Int): E
//}

// Ketika kita menandai sebuah tipe parameter dengan kata kunci out, nilai dari tipe parameter tersebut hanya
// bisa diproduksi seperti menjadikanya sebagai return type. Serta tidak dapat dikonsumsi seperti menjadikannya
// sebagai tipe argumen untuk setiap fungsi di dalam kelas tersebut.

// ==================
// Contravariant -> in

//  Nilai dari tipe parameter tersebut bisa dikonsumsi dengan menjadikannya sebagai tipe argumen untuk setiap
//  fungsi yang ada di dalam kelas tersebut dan tidak untuk diproduksi.
//interface Comparable<in T> {
//    operator fun compareTo(other: T): Int
//}