//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
// deve pagar uma multa de R$ 4,00 por quilo excedente.
// João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
// Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(){

    var r = Scanner(System.`in`);
println("Digite o peso total da pesca (em Kg): ");
    var peso = r.nextDouble();
    if(peso>50){
        var excesso = BigDecimal(peso-50).setScale(2, RoundingMode.HALF_EVEN);
        var multa=BigDecimal(excesso.toDouble()*4).setScale(2, RoundingMode.HALF_EVEN);

        println("Houve um excesso de ${excesso}Kg e você terá que pagar uma multa de ${multa}R$");
    }else{
        println("Parabéns, não houve excesso, logo você não pagará multa!")
    }
}