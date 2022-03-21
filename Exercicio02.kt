import java.util.*

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
fun main(){

    //Scanner faz o input de dados

    val leitura = Scanner(System.`in`);
    //Podemos usar vários dados como:
    /*
    * nextInt()
    * nextFloat()
    * nextDouble()
    * next()
    * nextLine()
    */
    println("Digite um número : ")
    
    var numero = leitura.nextInt();

    println("o número informado foi $numero!")
}