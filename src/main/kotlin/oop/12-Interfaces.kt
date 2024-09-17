package oop

// Interface sangat mirip dengan abstract class, namun tanpa sebuah properti deklarasi dan fungsi yang dideklarasikan tanpa isi.
//  Pada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital.  (IFly)
interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {

    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

// Perbedaan abstract dan interface

abstract class Animal10 {
    //default value not allowed
    abstract val age: Int //must be overridden

    //default value allowed
    open val isEating = true //optional to be overridden
    val isRespire = true //can not be overridden
}

interface IWalk {
    //default value not allowed
    val numberOfLeg: Int //must be overridden
    fun walk() //must be overridden
}

interface IDrink {
}

class Camel : Animal10(), IWalk, IDrink {
    override val age: Int = 7   // this property must exist, try to remove it
    override val isEating = true // this property optional, try to remove it
    override val numberOfLeg = 2 // this property must exist, try to remove it
    override fun walk() { // this method  must exist, try to remove it
        println("Camel can walk")
    }
}

fun main(){
    val camel = Camel()
    camel.walk()
}