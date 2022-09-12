package atividadesFaculdade

fun main(args: Array<String>) {
    println("=======TERMOS DE UMA PA=======")
    print("Informe o primerio termo da P.A:")
    var p1: Int = readLine()!!.toInt()
    print("Informe a razãoda P.A: ")
    var razao: Int = readLine()!!.toInt()

   for (p1 in 1..10){
       var p1 = p1 + razao
       println(p1)
   }

}


