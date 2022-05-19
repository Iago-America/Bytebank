import java.util.*

fun main(args: Array<String>) {
    var peça: Int;
    var nPeças: Int;
    var uniPeças: Double;

    var valor: Double = 0.0


    var soma = 0.0

    var i = 0

    val input = Scanner(System.`in`)
    println("VALOR A PAGAR: R$ " + "%.2f".format(soma))

    for (i in 1..2) {
        println("Digite a peça $i")
        peça = input.nextLine().toInt()
        nPeças = input.nextLine().toInt()
        uniPeças = input.nextLine().toDouble()

        valor = nPeças * uniPeças

        soma += valor

    }



}