class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {

    fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == 0) {
            return true
        } else {
            return false
        }
    }
}