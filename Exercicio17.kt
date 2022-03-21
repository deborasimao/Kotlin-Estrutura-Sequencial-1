//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(){

    var r = Scanner(System.`in`);

    println("Digite a área a ser pintada em m²: ");

    var area = r.nextDouble();

    var latasDeTinta18L = BigDecimal(area / 108 + 1).setScale(0,RoundingMode.HALF_EVEN);
    var precodalata18L = BigDecimal(80).setScale(0,RoundingMode.HALF_EVEN);
    var preco = BigDecimal(latasDeTinta18L.toDouble()*precodalata18L.toDouble()).setScale(0,RoundingMode.HALF_EVEN);

    var latasDeTinta = BigDecimal(area / 21.6 + 1).setScale(0,RoundingMode.HALF_EVEN);
    var precodalata = BigDecimal(25).setScale(0,RoundingMode.HALF_EVEN);
    var preco2 = BigDecimal(latasDeTinta.toDouble()*precodalata.toDouble()).setScale(0,RoundingMode.HALF_EVEN);

    println("Você vai precisar de ${latasDeTinta18L} latas de tinta de 18L para pintar toda a parede!");
    println("O valor total da compra será de ${preco}R$");
    println("");
    println("Você vai precisar de ${latasDeTinta} latas de tinta de 3,6L para pintar toda a parede!");
    println("O valor total da compra será de ${preco2}R$");

}