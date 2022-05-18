class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    //Super = Reutilizar para sobreescrever algo que já está pronto la na classe mãe, utilize o super
    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + plr
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }
}