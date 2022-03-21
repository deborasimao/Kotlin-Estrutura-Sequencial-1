import java.util.*
import java.math.BigDecimal
import java.math.RoundingMode

fun main(){

    var r = Scanner(System.`in`);
    println("Digite M para Sexo Masculino ou F para sexo Feminino: ")
    var sexo = r.nextLine().toUpperCase();

    if(sexo == "M" || sexo == "F"){
        if(sexo == "M"){
            println("Digite a sua altura: ");
                var h = r.nextDouble();
            var pesoIdealM = BigDecimal((72.7*h) - 58).setScale(2,RoundingMode.HALF_EVEN);
            println("O seu peso ideal é ${pesoIdealM}Kg");
        }else{
            println("Digite a sua altura: ");
            var h = r.nextDouble();
            var pesoIdealF = BigDecimal((62.1*h) - 44.7).setScale(2,RoundingMode.HALF_EVEN);
            println("O seu peso ideal é ${pesoIdealF}Kg");
        }
    }else{
        println("Você digitou um valor de sexo inválido!");
        println("Digite M se seu sexo for Masculino ou F caso seu sexo Feminino!");
    }
}