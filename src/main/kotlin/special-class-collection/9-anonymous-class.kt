package `special-class-collection`

// Seperti namanya, yang dimaksud dengan anonymous adalah class yang tak memiliki nama. Alih-alih mendefinisikan class menggunakan keyword class,
// Anda bisa langsung mendefinisikan isi dari sebuah class dengan menggunakan keyword object.

// ===========
// PERBANDINGAN

//interface IFly {
//    fun fly()
//}
//
//fun flyWithWings(bird: IFly) {
//    bird.fly()
//}
//
//class Bird : IFly {
//    override fun fly() {
//        println("The Bird flying")
//    }
//}
//
//fun main() {
//    flyWithWings(Bird())
//}

// ====================

interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    flyWithWings(object : IFly {
        override fun fly() {
            println("The Bird flying")
        }
    })
}