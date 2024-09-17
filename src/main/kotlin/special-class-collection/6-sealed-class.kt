package `special-class-collection`

// Sealed Class sebenarnya mirip dengan Enum Class, tetapi jauh lebih fleksibel. Berbeda dengan Enum Class
// yang hanya dapat berisi satu objek (instance) yang sama per class,
// Sealed Class dapat berisi beberapa objek yang berbeda-beda untuk memberikan informasi lebih
// Jadi lebih banyak objek yang disimpan

// Jika menggunakan enum

//enum class Result {
//    SUCCESS,
//    ERROR,
//    LOADING
//}

// Jika menggunakan sealed class

//sealed class Result {
//    data class Success(val data: Any) : Result()
//    data class Error(val message: String) : Result()
//    object Loading : Result()
//}

sealed class Result {
    sealed class Success(val data: Any) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()
}

fun main() {
    val result: Result = Result.Error("Oops!")
    when (result) {
        //jika salah satu kondisi dihapus, kode akan error
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading -> {
            println("Loading...")
        }
    }

//    Sealed Class adalah ia bersifat exhaustive.
//    Artinya, Anda harus menangani setiap kondisi yang ditentukan pada Sealed Class.
//    Jika salah satu dari when dihapus maka akan error
}