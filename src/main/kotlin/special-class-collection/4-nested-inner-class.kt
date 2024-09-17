package `special-class-collection`

// Artinya, Anda bisa membuat Class baru di dalam sebuah Class.

//TIDAK BISA DIAKSES OUTER CLASS

//class House {
//    // Properti outer class
//    val buildingArea = 100
//    class Room {
//
//        val totalRooms = 4
//        fun measureRoomArea() {
//            // Member class tidak dapat mengakses properti pada outer class
//            print(buildingArea/totalRooms)
//        }
//    }
//}

// ==========
// GUNAKAN INNER CLASS
class House {
    // Properti outer class
    val buildingArea = 100
    inner class Room {
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti pada outer class
            print(buildingArea/totalRooms)
        }
    }
}

// Apabila nama property sama dengan outer-inner gunakan this

class House2 {
    // Properti atau anggota outer class
    val buildingArea = 100
    val totalRooms = 4

    inner class Room {
        // Properti atau anggota inner class
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti atau anggota outer class
            print(buildingArea/this@House2.totalRooms)
        }
    }
}

fun main() {
    val house = House()
    val room = house.Room()
    room.measureRoomArea()
}
