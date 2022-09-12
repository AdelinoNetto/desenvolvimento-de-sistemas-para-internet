package atividadesFaculdade

fun main(args: Array<String>) {
    print("Informe o numero:")
    var numero: Int = readLine()!!.toInt()
    var fatorial: Int = 1
    var i: Int = 1

    while (i <= numero){
        fatorial = fatorial * i
        i++
   }

    println("O fatorial do numero $numero é = $fatorial")
}