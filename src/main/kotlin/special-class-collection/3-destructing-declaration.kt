package `special-class-collection`

// Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel.
// componentN()
data class DataUser2(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser2("Nafis", 19)

    val name = dataUser.component1()
    val age = dataUser.component2()

//  SIMPEL
//    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
    }

//    Ketika mempunyai data yang sangat kompleks, kita juga bisa menerapkan sebuah behaviour di dalam data class.
//data class DataUser2(val name : String, val age : Int){
//    fun intro(){
//        println("My name is $name, I am $age years old")
//    }
//}

//    fun main(){
//        val dataUser = DataUser2("nrohmen", 23)
//        dataUser.intro()
//    }
