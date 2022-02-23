fun main() {
    println("Bem vindo ao ByteBank")
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    saldo = 100 + 2.0
    saldo += 200

    println("titular $titular")
    println("numero da conta $numeroConta")
    println("saldo da conta $saldo")

    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> println("conta negativa")
    }
}
