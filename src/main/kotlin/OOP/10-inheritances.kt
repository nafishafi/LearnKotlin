package OOP

// INHERITANCES = PEWARISAN

// class ChildClass : ParentClass {
//
//}
//
open class Animal8(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal8(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main(){
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}

// ==============
// Jika Anda tidak ingin mengambil alih penuh, tetapi hanya ingin menambahkan implementasi dari yang sudah di parent class
// GUNAKAN SUPER

//open class Animal9(val name: String){
//    open fun eat(){
//        println("$name sedang makan!")
//    }
//}
//
//
//class Cat(pName: String) : Animal9(pName) {
//    override fun eat(){
//        super.eat()
//        println("$name sedang memakan ikan !")
//    }
//}
//
//
//fun main(){
//    val dicodingCat = Cat("Dicoding Miaw")
//    dicodingCat.eat()
//}
