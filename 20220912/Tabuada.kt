package atividadesFaculdade

fun main(args: Array<String>) {

    print("Qual a tabuada: ")
    var tabuada: Int = readLine()!!.toInt()

    for (i in 0 ..10){
        val res = tabuada * i
        println("$i * $tabuada = $res")
    }
}
