package OOP

// PROPERTY CONSTURCTOR -> Parameter
//class Animal4(val name: String, val weight: Double, val age: Int=9, val isMammal: Boolean)
//
//fun main(){
//    val dicodingCat = Animal4("Dicoding Miaw", 4.2, isMammal = true)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//}

// Init Block -> penggabungan property dan parameter
class Animal4(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

fun main() {
    val dicodingCat = Animal4("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

// JIKA INGIN SAMA PROPERTY DAN PARAMETER GUNAKAN THIS
// Property = Parameter
//class Animal(name: String, weight: Double, age: Int, isMammal: Boolean) {
//    val name: String
//    val weight: Double
//    val age: Int
//    val isMammal: Boolean
//
//    init {
//        this.weight = if(weight < 0) 0.1 else weight
//        this.age = if(age < 0) 0  else age
//        this.name = name
//        this.isMammal = isMammal
//    }
//}