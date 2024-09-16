package OOP

// Nullable
//var name: String? = null
//fun main() {
//    name = "Dicoding Miaw"
//    print(name?.length)
//}

// DIGUNAKAN KETIKA INGIN VARIABEL TIDAK PUNYA NILAI AWAL
//Hal yang perlu diperhatikan adalah lateinit harus disandingkan dengan keyword var
//(tidak bisa menggunakan val)
//lateinit var name: String
//fun main() {
//    name = "Dicoding Miaw"
//    print(name.length)
//}

//  Memeriksa apakah variabel tersebut sudah diinisialisasi -> isInitialized
//lateinit var name: String
//fun main() {
//    name = "Dicoding Miaw"
//    if (::name.isInitialized)
//        print(name.length)
//    else
//        print("Not Initialized")
//}

//  ================
//  Lazy Properti
//  Note: Dalam menggunakan lazy property, Anda harus menggunakan keyword val. Hal ini karena nilainya hanya dapat diinisialisasi satu kali.
val name: String by lazy {
    "Dicoding Miaw"
}
fun main() {
    print(name.length)
}