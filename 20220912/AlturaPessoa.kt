package atividadesFaculdade

fun main(args: Array<String>) {
    var maiorAltura:Double = 0.0
    var menorAltura: Double = 10000.0

    for (i in 1..5){
        print("Informe a altuara: ")
        var altura:Double = readLine()!!.toDouble()

        if (altura > maiorAltura){
            maiorAltura = altura
        } else if (altura < menorAltura){
            menorAltura = altura
        }
    }
    println("Maior altura é $maiorAltura")
    println("Menor altura é $menorAltura")
}