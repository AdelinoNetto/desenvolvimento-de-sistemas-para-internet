package atividadesFaculdade

fun main(args: Array<String>) {
    print("Entre com o valor do primeiro lado do triangulo: ")
    var a:Double = readLine()!!.toDouble()
    print("Entre com o valor do segundo lado do triangulo: ")
    var b:Double = readLine()!!.toDouble()
    print("Entre com o valor do terceiro lado do triangulo: ")
    var c:Double = readLine()!!.toDouble()

    var perimetro: Double = a+b+c
    var area: Double = (a+b) * c /2.0

    if (a+b > c || a+c > b || b+c > a){
        println("Perimetro = $perimetro")
    } else {
        println("Area = $area")
    }

}