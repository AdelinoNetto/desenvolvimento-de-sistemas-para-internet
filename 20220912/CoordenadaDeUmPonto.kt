package atividadesFaculdade

fun main(args: Array<String>) {

    println("INFORME AS COORDENADAS DO PRIMEIRO PONTO")
    val coordenada1:Double = readLine()!!.toDouble()

    println("INFORME AS COORDENADAS DO SEGUNDO PONTO")
    val coordenada2:Double = readLine()!!.toDouble()

    if (coordenada1 == 0.0 && coordenada2 == 0.0){
        print("Origem.")
    }else if (coordenada1 == 0.0){
        print("Eixo X.")
    } else if (coordenada2 == 0.0){
        print("Eixo Y.")
    } else if (coordenada1 > 0.0 && coordenada2 >0.0){
        print("QUADRANTE 1")
    } else if (coordenada1 < 0.0 && coordenada2 > 0.0){
        print("QUADRANTE 2")
    } else if (coordenada1 < 0.0 && coordenada2 < 0.0){
        print("QUADRANTE 3")
    } else {
        print("QUADRANTE 4")
    }
}