fun main() {

    val nomeProduto = "iMac"
    val preco = 22000.0

    if (nomeProduto == "iMac" && preco >= 10000.0) {

        val desconto = preco * 0.12
        val totalComDesconto = preco - desconto

        println("Desconto aplicado de 12%. Total a pagar: R$ $totalComDesconto")
    } else {
        println("Produto sem desconto.")
    }
}
