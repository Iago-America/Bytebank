import java.util.*
fun main(args: Array<String>) {
    var A: Double
    var B: Double

    val input = Scanner(System.`in`)

    A = input.nextLine().toDouble() * 3.5
    B = input.nextLine().toDouble() * 7.5

    var media: Double = (A + B) / 11
    var media2 = media

    println("MEDIA = " + "%.5f".format(media2))
}