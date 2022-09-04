package atividadesFaculdade

fun main(args: Array<String>) {
    println("Entre com o primeiro número: ")
    val numero1:Int = readLine()!!.toInt()
    println("Entre com o segundo número: ")
    val numero2:Int = readLine()!!.toInt()

    if ((numero1 > numero2) && (numero1 % numero2 == 0)){
        println("São Multiplos")
    } else{
        println("Não são multiplos")
    }
}