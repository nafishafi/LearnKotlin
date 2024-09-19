package `special-class-collection`

// Misalnya Anda mempunyai collection dengan jumlah data 10 atau 100 , itu mungkin tidak akan memberi
// pengaruh besar terhadap performa program. Namun apa yang terjadi jika data yang ada pada collection
// mencapai ratusan ribu atau jutaan? Waktu proses pada sebuah program akan bertambah signifikan jika semua datanya harus dievaluasi.


//fun main() {
//    val list = (1..10000).toList()
//    val number = list.filter { it % 5 == 0 }.map { it * 2 }.first()
//    println(number)
//}

// Pada penggunaan diatas data akan di evaluasi sampai akhir

// ==============
// Sequences
fun main() {
    val list = (1..10000).toList()
    val number = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)

//  Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1.
//  Karena tidak memenuhi kondisi pada filter, operasi tidak akan dilanjutkan ke map()

//  ===========
//  generate sequences
    val sequenceNumber = generateSequence(1) { it + 1 } // Fungsi generateSequence() akan membuat collection sequence secara tak terbatas. Alhasil, kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop.
    sequenceNumber.take(5).forEach { print("$it ") }
}
