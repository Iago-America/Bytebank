import java.util.*

fun main(args: Array<String>) {
    var name: String
    var value1: Double
    var value2: Double

    val input = Scanner(System.`in`)

    name = input.nextLine().toString()
    value1 = input.nextLine().toDouble()
    value2 = input.nextLine().toDouble()

    var salario = value1 + (value2*0.15)

    println("TOTAL = R$ " + "%.2f".format(salario))

}