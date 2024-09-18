package `special-class-collection`

// Ada hal menarik dari implementasi anonymous class, yakni Anda dapat menggunakan function interface
// untuk membuat kode Anda lebih ringkas dan bisa dibaca dengan mudah. Function Interface atau biasa disebut
// Single Abstract Method (SAM) Interface adalah sebuah interface yang memiliki satu method abstract. Anda cukup menambahkan keyword “fun” sebelum keyword “interface” .


// Berikut adalah contoh kode ketika Anda menggunakan SAM Conversion.

fun interface IFly2 {
    fun fly()
}
fun flyWithWings2(bird: IFly2) {
    bird.fly()
}
fun main(){
    flyWithWings2(object : IFly2 {
        override fun fly() {
            println("The Bird flying")
        }
    })

//    SAM CONSERVATION
    flyWithWings2 {
        println("The Bird flying")
    }
}

//Yang perlu menjadi catatan adalah cara ini hanya bisa dilakukan pada interface
//yang hanya memiliki member satu fungsi saja, sesuai dengan namanya yakni Single Abstract Method (SAM).