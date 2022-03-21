//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(){

    var r = Scanner(System.`in`);

    println("Digite a área a ser pintada em m²: ");

    var area = r.nextDouble();

    var latasDeTinta = BigDecimal(area / 54 + 1).setScale(0,RoundingMode.HALF_EVEN);
    var precodalata = BigDecimal(80).setScale(0,RoundingMode.HALF_EVEN);
    var preco = BigDecimal(latasDeTinta.toDouble()*precodalata.toDouble()).setScale(0,RoundingMode.HALF_EVEN);

    println("Você vai precisar de ${latasDeTinta} latas de tinta para pintar toda a parede!");
    println("O valor total da compra será de ${preco}R$");
}