package atividadesFaculdade

fun main(args: Array<String>) {
    println("=======TERMOS DE UMA PG=======")
    print("Informe o primerio termo da P.G:")
    var p1: Int = readLine()!!.toInt()
    print("Informe a razãoda P.G: ")
    var razao: Int = readLine()!!.toInt()

    for (p1 in 1..10){
        var p1 = p1 * razao
        println(p1)
    }

}