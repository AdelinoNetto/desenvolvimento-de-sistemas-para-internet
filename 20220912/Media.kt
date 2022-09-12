package atividadesFaculdade

fun main(args: Array<String>) {
    print("Entre com a primenria nota: ")
    var nota1: Double = readLine()!!.toDouble()
    print("Entre com a segunda nota: ")
    var nota2: Double = readLine()!!.toDouble()
    print("Entre com a terceira nota: ")
    var nota3: Double = readLine()!!.toDouble()
    print("Entre com a quarta nota: ")
    var nota4: Double = readLine()!!.toDouble()

    var mediaPonderada: Double = (2 * nota1) + (3 * nota2) + (4 * nota3) + (1 * nota4) / 2.0+3.0+4.0+1.0

    if (mediaPonderada >= 7.0){
        println("Media $mediaPonderada")
        println("Aluno aprovado")
    } else if (mediaPonderada < 5.0){
        println("Aluno reprovado")
    } else if (mediaPonderada >= 5 && mediaPonderada <= 6.9) {
        println("Aluno em exame")
        print("Entre com a nota do exame")
        var notaExame: Double = readLine()!!.toDouble()

        var mediaFinal: Double = mediaPonderada + notaExame / 2.0

        if (mediaFinal >= 5.0) {
            print("Aluno aprovado.")
            print("Meida final: $mediaFinal")
        } else {
            print("Aluno reprovado.")
            print("Meida final: $mediaFinal")
        }
    }

}