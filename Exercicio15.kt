import java.util.*
import java.math.BigDecimal
import java.math.RoundingMode
fun main(){

    var r = Scanner(System.`in`);

    println("Quanto você ganha por hora: ");
    var hora = r.nextFloat();
    println("Quantas horas você trabalhou esse mês: ")
    var mes = r.nextFloat();

    var salarioBruto = hora*mes;

    var INSS = BigDecimal(salarioBruto*0.08).setScale(2, RoundingMode.HALF_EVEN);

    var IR = BigDecimal(salarioBruto*0.11).setScale(2, RoundingMode.HALF_EVEN);

    var sindicato = BigDecimal(salarioBruto*0.05).setScale(2, RoundingMode.HALF_EVEN);

    var salarioLiquido = BigDecimal(salarioBruto.toDouble()-INSS.toDouble()-IR.toDouble()-sindicato.toDouble()).setScale(2, RoundingMode.HALF_EVEN);

    println("SALÁRIO BRUTO");
    println("O seu salário bruto foi de ${salarioBruto}R$");
    println("DESCONTOS");
    println("O desconto do seu INSS foi de ${INSS}R$");
    println("O desconto do seu imposto de renda foi de ${IR}R$");
    println("O desconto d seu sindicato foi de ${sindicato}R$");
    println("SALÁRIO LÍQUIDO");
    println("O seu salário líquido é de ${salarioLiquido}R$");
}
