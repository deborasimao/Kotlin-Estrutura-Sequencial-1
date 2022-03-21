import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(){

    var r = Scanner(System.`in`);
    println("Digite o tamanho do arquivo em MB: ")
    var tamanho = r.nextDouble();
    println("Digite a velocidade do arquivo em Mbps: ")
    var velocidade = r.nextDouble();

    var tempo = BigDecimal(velocidade/tamanho).setScale(2, RoundingMode.HALF_EVEN);

    println("Levará ${tempo} segundos para enviar esse arquivo!")
}