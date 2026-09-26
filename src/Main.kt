class Song(
    val title: String,
    val artist: String,
    val releaseYear: Int,
    val playCount: Int
) {
    val isPopular: Boolean = playCount >= 1000

    fun description() {
        println("$title, performed by $artist, was released in $releaseYear.")
    }
}

fun main() {
    val song1 = Song("The boy is mine", "Ben Delay", 2016, 5000000)
    val song2 = Song("My Local Song", "Unknown Artist", 2024, 500)

    song1.description()
    println("Is popular: ${song1.isPopular}")

    song2.description()
    println("Is popular: ${song2.isPopular}")
}