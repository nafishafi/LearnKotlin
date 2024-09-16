package OOP

import kotlin.reflect.KProperty

//Pengelolaan properti kelas baik itu memberikan atau mengubah sebuah nilai dapat didelegasikan kepada kelas lain.
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal3 {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
    val animal = Animal3()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
}

// ====================
// Any tipe data
//import kotlin.reflect.KProperty
//
//class DelegateGenericClass {
//    private var value: Any = "Default"
//
//    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
//        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
//        return value
//    }
//
//    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
//        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
//        value = newValue
//    }
//}
//
//class Animal {
//    var name: Any by DelegateGenericClass()
//    var weight: Any by DelegateGenericClass()
//    var age: Any by DelegateGenericClass()
//}
//
//fun main(){
//    val animal = Animal()
//    animal.name = "Dicoding cat"
//    animal.weight = 6.2
//    animal.age = 1
//
//    println("Nama: ${animal.name}")
//    println("Berat: ${animal.weight}")
//    println("Umur: ${animal.age} Tahun")
//}