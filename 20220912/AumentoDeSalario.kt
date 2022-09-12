package atividadesFaculdade

fun main(args: Array<String>) {
    print("Salário do fincionario: ")
    var salario: Double = readLine()!!.toDouble()
    var novoSalario: Double = 0.0

    if (salario >= 0.00 && salario <=400.00){
        println("Novo salario: R$." + (salario + (salario * 15/100)))
        println("Reajuste ganho: R$" + salario * 15/100)
        println("Em percentual " + 15 + "%")
    }else if(salario >= 400.01 && salario <=800.00){
        println("Novo salario: R$." + (salario + (salario * 12/100)))
        println("Reajuste ganho: R$" + salario * 12/100)
        println("Em percentual " + 12 + "%")
    } else if(salario >= 800.01 && salario <=1200.00){
        println("Novo salario: R$." + (salario + (salario * 10/100)))
        println("Reajuste ganho: R$" + salario * 10/100)
        println("Em percentual " + 10 + "%")
    } else if(salario >= 1000.01 && salario <=2000.00){
        println("Novo salario: R$." + (salario + (salario * 7/100)))
        println("Reajuste ganho: R$" + salario * 7/100)
        println("Em percentual " + 7 + "%")
    } else {
        kotlin.io.println("Novo salario: R$." + (salario + (salario * 4 / 100)))
        kotlin.io.println("Reajuste ganho: R$" + salario * 4 / 100)
        kotlin.io.println("Em percentual " + 4 + "%")
    }


}