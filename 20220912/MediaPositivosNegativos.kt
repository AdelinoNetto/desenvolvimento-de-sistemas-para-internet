package atividadesFaculdade

fun main(args: Array<String>) {

    var positivo: Double = 0.0
    var negativo: Double = 0.0
    var num: Double = 0.0

    while (num != 0.0){
        val line = readLine() ?: "0"
        num = line.toDoubleOrNull()!!

        println("Voce escolheu a opção $num")
    }

}