package `kotlin-generics`

// Kita bisa menerapkannya dengan meletakkan tipe parameter dalam angle brackets (<>)
interface List<T>{
    operator fun get(index: Int) : T
}

// T digunakan sebagai placeholder yang akan bisa tentukan sendiri tipenya -> bisa diganti yg lain ex: P

// Pewarisan
class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)

    println("hal0")
}