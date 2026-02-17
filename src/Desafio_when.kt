fun main() {
    print("Digite o dia (SEG, TER, QUA, QUI, SEX, SAB, DOM): ")
    val dia = readLine()?.trim()?.uppercase()

    when (dia) {
        "SAB", "DOM" -> println("Fim de semana ")
        "SEG", "TER", "QUA", "QUI", "SEX" -> println("Dia útil ")
        else -> println("Erro: dia inválido. Use SEG, TER, QUA, QUI, SEX, SAB ou DOM.")
    }
}
