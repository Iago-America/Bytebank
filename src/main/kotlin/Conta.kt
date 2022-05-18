//A primeira letra de uma classe deve ser maiuscula
class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    //Métodos ou Comportamentos
    fun deposita(valor: Double) {
        this.saldo += valor
        println(
            "Depósito de $valor, na conta de $titular," +
                    " o saldo atual é: $saldo"
        )
    }

    fun saca(valor: Double) {
        println("Realizando o saque na conta de $titular")
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
        println(
            "Saque de $valor, na conta de $titular," +
                    " o saldo atual é: $saldo \n"
        )
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor) //Se o comportamento é só depositar, pq não reutilizar o código?
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        saldo = valor
//    }

}