fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.11-11",
        salario = 1000.0,
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: R$${alex.salario}")

    println("A bonificação de ${alex.nome} será de R$${alex.bonificacao()}")


    val iago = Gerente(
        nome = "iago",
        cpf = "222.222.222 - 05",
        salario = 5000.0,
        senha = 0
    )

    if (iago.autentica(iago.senha)) {
        println("Autenticado com sucesso")
    } else {
        println("Erro na autenticação")
    }

    println("Nome: ${iago.nome}")
    println("CPF: ${iago.cpf}")
    println("Salário: R$${iago.salario}")

    println("A bonificação de ${iago.nome} será de R$${iago.bonificacao()}\n")

    val lucas = Diretor(
        nome = "Lucas",
        cpf = "333.333.333-33",
        salario = 8000.0,
        senha = 6512,
        plr = 500.0
    )

    if (lucas.autentica(6512)) {
        println("Autenticado com sucesso")
    } else {
        println("Erro na autenticação")
    }

    println("Nome: ${lucas.nome}")
    println("CPF: ${lucas.cpf}")
    println("Salário: R$${lucas.salario}")
    println("Senha: ${lucas.senha}")
    println("PLR: ${lucas.plr}")


}






