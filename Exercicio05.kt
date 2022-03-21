//Faça um Programa que converta metros para centímetros.
import java.util.*

fun main(){
var r = Scanner(System.`in`);
    println("Digite o valor em metros: ")
    var metros = r.nextFloat();
    var centimetros = metros/100;
    println("O valor em centimetros é $centimetros")
}