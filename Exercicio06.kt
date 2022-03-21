import java.util.*

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

fun main(){
    var r = Scanner(System.`in`)
    println("Qual do valor do raio do circulo?")
    var raio = r.nextFloat()
    var area = 3.14*(raio*raio)
    println("A área do círculo é $area")
}