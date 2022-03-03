fun main() {
    println("Bem vindo ao ByteBank")

    val contaIngrid = Conta()
    contaIngrid.titular = "Ingrid"
    contaIngrid.numero = 1000
    contaIngrid.saldo = 300.0

    println(contaIngrid.titular)
    println(contaIngrid.numero)
    println(contaIngrid.saldo)
    println()

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 520.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println("Depositando na conta da Ingrid")
    deposita(contaIngrid, 50.0)
    println(contaIngrid.saldo)
    println()

    println("Depositando na conta da Fran")
    deposita(contaFran, 150.0)
    println(contaFran.saldo)

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")
    println()

    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta joao: ${contaMaria.titular}")
    println()

    println(contaJoao)
    println(contaMaria)
}

fun testaLaco() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> println("conta negativa")
    }
}