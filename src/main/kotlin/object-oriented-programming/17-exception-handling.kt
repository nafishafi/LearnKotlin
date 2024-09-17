package `object-oriented-programming`

//  try-catch, try-catch-finally, dan multiple catch

// =========
// try-catch

//try {
//    // Block try, menyimpan kode yang membangkitkan exception
//} catch (e: SomeException) {
//    // Block catch akan terpanggil ketika exception bangkit.
//}

//Dengan menuliskan kode dalam blok try, kode kita menjadi terproteksi dari exception. Jika terjadi exception maka program tidak akan terhenti atau crash, namun akan dilempar menuju blok catch.
//Di sana kita dapat menuliskan sebuah kode alternatif untuk menampilkan pesan eror atau yang lainnya.
//
//fun main() {
//    val someNullValue: String? = null
//    lateinit var someMustNotNullValue: String
//
//    try {
//        someMustNotNullValue = someNullValue!!
//        println(someMustNotNullValue)
//    } catch (e: Exception) {
//        someMustNotNullValue = "Nilai String Null"
//        println(someMustNotNullValue)
//    }
//}

// ==========
// try-catch-finally
// blok finally bersifat optional

//fun main() {
//    val someNullValue: String? = null
//    lateinit var someMustNotNullValue: String
//
//    try {
//        someMustNotNullValue = someNullValue!!
//    } catch (e: Exception) {
//        someMustNotNullValue = "Nilai String Null"
//    } finally {
//        println(someMustNotNullValue)
//    }
//}

// =============
// Multiple Catch

//try{
//    // Block try, menyimpan kode yang membangkitkan exception
//} catch (e: NullPointerException) {
//    // Block catch akan terpanggil ketika terjadi NullPointerException.
//} catch (e: NumberFormatException) {
//    // Block catch akan terpanggil ketika terjadi NumberFormatException.
//} catch (e: Exception) {
//    // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
//}
//finally {
//    // Block finally akan terpanggil setelah keluar dari block try atau catch
//}

import kotlin.NumberFormatException

fun main() {
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}
