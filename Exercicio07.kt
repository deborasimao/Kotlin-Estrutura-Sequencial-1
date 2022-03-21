//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.*

fun main(){

    var r = Scanner(System.`in`);
    println("Digite o tamanho do lado do quadrado: ")
    var ladoDoQuadrado = r.nextFloat();

    var area = ladoDoQuadrado*ladoDoQuadrado;
    var dobroArea = 2 * area;

    println("A área do quadrado é: $area m²")
    println("O dobro da área do quadrado é: $dobroArea m²")
}
