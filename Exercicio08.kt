//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.
import java.util.*

fun main(){

    var r = Scanner(System.`in`);

    println("Digite quanto você ganha por hora trabalhada: ");
    var ganhoPorHora = r.nextFloat();
    println("Digite quantas horas você trabalhou esse mês: ");
    var horasTrabalhadas = r.nextFloat();

    var salario = ganhoPorHora*horasTrabalhadas;

    println("O seu salário esse mês será de $salario ")
}