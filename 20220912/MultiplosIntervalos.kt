package atividadesFaculdade

fun main() {
    var num: Double = 0.0
    var cont1: Double =0.0
    var cont2: Double =0.0
    var cont3: Double =0.0
    var cont4: Double =0.0

    while (num <= 0){
        print("Digite um numero: ")
        val num:Double = readLine()!!.toDouble()

       if (num >=0.00 && num <=25.00){
           cont1+= num
       } else if (num >=25.01 && num <=50.00){
           cont2+= num
       } else if (num >=50.01 && num <=75.00){
           cont3+= num
       } else if (num >=75.01 && num <=100.00){
           cont4+= num
       }

      }
    println("$cont1")
    println("$cont2")
    println("$cont3")
    println("$cont4")
    println("Fim do programa")
    }
