package atividadesFaculdade

fun main(args: Array<String>) {
    println("Infomre as caracteristicas do animal.")
    println("Primeira caracteristica, ele é VERTEBRADO OU INVERTEBRADO ")
    var tipo1: String = readLine()!!.toString()
    println("Segunda caracteristica, ele é uma AVE , MAMIFERO , INSETO , ANELIDEO ")
    var tipo2: String = readLine()!!.toString()
    println("Terceira caracteristica, ele é um CARNIVORO , ONIVARO , HERBIVARO , HEMATOFAGO ,  ")
    var tipo3: String = readLine()!!.toString()

    if (tipo1 == "vertebrado" && tipo2 == "ave" && tipo3 == "carnivoro"){
        print("O seu animal é uma AGUIA")
    } else if (tipo1 == "vertebrado" && tipo2 == "ave" && tipo3 == "onivaro"){
        print("O seu animal é uma POMBA")
    } else if (tipo1 == "vertebrado" && tipo2 == "mamifero" && tipo3 == "onivaro") {
        print("O seu animal é um HOMEM")
    }else if (tipo1 == "vertebrado" && tipo2 == "mamifero" && tipo3 == "herbivaro") {
        print("O seu animal é uma VACA")
    } else if (tipo1 == "invertebrado" && tipo2 == "inseto" && tipo3 == "hematofago") {
        print("O seu animal é uma PULGA")
    }  else if (tipo1 == "invertebrado" && tipo2 == "inseto" && tipo3 == "herbivaro") {
        print("O seu animal é uma LAGARTA")
    } else if (tipo1 == "invertebrado" && tipo2 == "anelidio" && tipo3 == "hematofago") {
        print("O seu animal é uma SANGUESSUGA")
    }  else if (tipo1 == "invertebrado" && tipo2 == "anelideo" && tipo3 == "onivaro") {
        print("O seu animal é uma MINHOCA")
    } else {
        println("TIPO DO ANIMAL INVALIDO!!")
    }
}