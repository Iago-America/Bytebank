fun testaComportamentosConta() {
    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(valor = 200.0)

    val contaFran = Conta(titular = "Fran", numero = 1000)
    contaFran.deposita(valor = 1000.0)

//    println(contaFran.getSaldo())
//    contaFran.setSaldo(1000.0)
//    println(contaFran.getSaldo())


    println("\nTitular: ${contaAlex.titular}")
    println("Número da conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}\n")

    println("Titular: ${contaFran.titular}")
    println("Número da conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo} \n")


    if (contaFran.transfere(800.0, contaAlex)) {
        println("Transferencia realizada com sucesso")
    } else {
        println("Transferencia negada")
    }
}