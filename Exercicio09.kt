//Faça um Programa que peça a temperatura em graus Fahrenheit
// transforme e mostre a temperatura em graus Celsius.
import java.util.*

fun main(){
    var r = Scanner(System.`in`);
    println("Digite a temperatura em graus Fahrenheit: ");
    var fahrenheit = r.nextFloat();
    var celsius = 5 * ((fahrenheit-32) / 9);
    println("A sua temperatura é de $celsius°C");
}