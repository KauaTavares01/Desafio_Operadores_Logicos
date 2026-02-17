fun main (){

    println("Digite sua idade")
    val idade = readLine()?.toIntOrNull()

    if (idade === null ){
        println("idade invalida")
    };
    else if (idade <= 18){
        println("Você tem $idade, entao nao pode dirigir")
    };
    else{
        println("Você tem $idade anos e pode dirigir !!")
    };

}