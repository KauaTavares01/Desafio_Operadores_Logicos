
    fun main() {

        println("=============================================")
        println("=============================================")
        println("IREMOS VERIFICAR SE VOCE TEM OS REQUISITOS !! SEJA SINCERO PARA CONCORRER A VAGA")
        println("=============================================")
        println("=============================================")
        println("")

        println("voce e motorista ? (SIM/NAO):")
        val verificacao = readLine()?.trim()?.equals("SIM", ignoreCase = true) == true

        println("qual sua idade ?")
        val idade = readLine()?.toIntOrNull()


        if (verificacao === null) {
            println("resposta invalida !!")

        }

        if (idade === null) {
            println("resposta invalida !!")
        } else if (verificacao && idade >= 30) {
            println("Voce pode dirigir, e a condição foi atendida: e motorista !!")

        } else {
            println("Condição não atendida, precisa ter mais de 30 anos e ser motorista !")
        }


    }
