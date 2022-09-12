package atividadesFaculdade

fun main(args: Array<String>) {
    println("CODIGO   ESPECIFICAÇÃO      PREÇO")
    println("1        cachorro quente    R$ 4.00\n" +
            "2        X-Salada           R$ 4.50\n" +
            "3        X-Bacon            R$ 5.00\n" +
            "4        Torrada simples    R$ 2.00\n" +
            "5        Refrigerante       R$ 1.50")
    println("Informe o código desejado conforme a tabela acima")
    val codigo:Int = readLine()!!.toInt()

    println("Informe a quantidade do pedido:")
    val quantidade:Int = readLine()!!.toInt()

   // val total = codigo * quantidade

    if (codigo == 1) {
        print("TOTAL R$: " + quantidade * 4.0)
    } else if (codigo == 2) {
        print("TOTAL R$: " + quantidade * 4.5)
    } else if (codigo == 3) {
         print("TOTAL R$: " + quantidade * 5.0)
    }  else if (codigo == 4) {
        print("TOTAL R$: " + quantidade * 2.0)
    } else {
        print("TOTAL R$: " + quantidade * 1.5)
    }
}