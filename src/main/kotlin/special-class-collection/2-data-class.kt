package `special-class-collection`

// Hanya dengan satu baris kode di atas, kompiler akan secara otomatis menghasilkan
// constructor, toString(), equals(), hashCode(), copy() dan juga fungsi componentN().

//data class User(val name : String, val age : Int)

// ==========
// Perbandingan
class User(val name : String, val age : Int)

// HARUS DIBERI INI AGAR TGERCETAK
//class User(val name : String, val age : Int){
//
//    override fun toString(): String {
//        return "User(name=$name, age=$age)"
//    }
//}

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)


    println(user)  // special-class-collection.User@312b1dae
    println(dataUser)  // DataUser(name=nrohmen, age=17)

}