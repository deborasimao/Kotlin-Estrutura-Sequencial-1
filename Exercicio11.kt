//Faça um Programa que peça 2 números inteiros e um número real.
// Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo.
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.

import java.util.*

fun main(){

    var r = Scanner(System.`in`);
println("Digite o primeiro número inteiro: ");
    var n1 = r.nextInt();
    println("Digite o segundo número inteiro: ");
    var n2 = r.nextInt();
    println("Digite o terceiro número real: ");
    var n3 = r.nextFloat();

    var calc1 = (n2/2)*(2*n1);
    var calc2 = (3*n1)+(n3);
    var calc3 = n3*n3*n3;

    println("o produto do dobro de ${n1} com metade de ${n2} é igual a ${calc1}");
    println("a soma do triplo de ${n1} com ${n3} é igual a ${calc2}");
    println("${n3} elevado ao cubo é igual a ${calc3}");
}
