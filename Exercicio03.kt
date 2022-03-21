import java.util.*

//Faça um Programa que peça dois números e imprima a soma.
fun main(){

    val r = Scanner(System.`in`);

    println("Digite os numeros que vc quer somar: ");

    println("A soma entre os números é ${soma(numero1=r.nextInt(),numero2 = r.nextInt())}")
}
fun soma (numero1:Int,numero2:Int):Int{
    return numero1+numero2;
}