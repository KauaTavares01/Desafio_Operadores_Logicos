fun main() {

    print("Você é motorista? (SIM/NAO): ")
    val ehMotorista = readLine()
        ?.trim()
        ?.equals("SIM", ignoreCase = true) == true

    print("Informe sua idade: ")
    val idade = readLine()?.toIntOrNull()

    if (idade == null) {
        println("Idade inválida.")
    } else if (ehMotorista || idade >= 17) {
        println("Pode dirigir ")
    } else {
        println("Não pode dirigir ")
    }
}
