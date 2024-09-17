package `special-class-collection`

// Enum Class atau Enumeration merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek
// yang telah didefinisikan menjadi tipe data konstanta.

// RAWAN TERTUKAR
//val colorRed = 0xFF0000
//val colorGreen = 0x00FF00
//val colorBlue = 0x0000FF

// GUNAKAN ENUM
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//fun main() {
//    val colorRed = Color.RED
//    val colorGreen = Color.GREEN
//    val colorBlue = Color.BLUE
//
//    println(colorBlue)
//}

// BISA DITAMBAH DG FUNGSI LAIN
// Abstract dan anonymous class

//enum class Color(val value: Int) {
//    RED(0xFF0000){
//        override fun printValue() {
//            println("value of RED is $value")
//        }
//    },
//    GREEN(0x00FF00){
//        override fun printValue() {
//            println("value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF){
//        override fun printValue() {
//            println("value of BLUE is $value")
//        }
//    };
//
//    abstract fun printValue()
//}

// ===============
//Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values().
//Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()

//fun main() {
//    val color: Color = Color.valueOf("RED")
//    println("Color is $color")
//    println("Color value is ${color.value.toString(16)}")
//}

// Kita bisa mendapatkan daftar objek Enum dan nama dari objek Enum dengan cara yang lebih umum.

fun main () {
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")

//  posisi ordinal
//    val color: Color = Color.GREEN
//
//    print("Position GREEN is ${color.ordinal}")

//  =================
//    Mengecek instance dari Enum

//    val color: Color = Color.GREEN
//
//    when(color){
//        Color.RED -> print("Color is Red")
//        Color.BLUE -> print("Color is Blue")
//        Color.GREEN -> print("Color is Green")
//    }
}
