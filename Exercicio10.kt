//Faça um Programa que peça a temperatura em graus Celsius
// transforme e mostre em graus Fahrenhei
import java.util.*

fun main(){
    var r = Scanner(System.`in`);
    println("Digite a temperatura em graus Celsius: ");
    var  celsius = r.nextFloat();
    var fahrenheit = 1.8*celsius+32;
    println("A sua temperatura é de $fahrenheit°C")
}