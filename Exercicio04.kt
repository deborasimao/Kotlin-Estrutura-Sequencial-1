import java.util.*

fun main(){
    var r = Scanner(System.`in`);

    println("Digite suas notas bimestrais: ");
println("A sua média anual foi ${media(nota1 = r.nextFloat(),nota2 = r.nextFloat(),nota3 = r.nextFloat(),nota4 = r.nextFloat())}")
}
fun media(nota1:Float,nota2:Float,nota3:Float,nota4:Float):Float{
    return (nota1+nota2+nota3+nota4)/4
}