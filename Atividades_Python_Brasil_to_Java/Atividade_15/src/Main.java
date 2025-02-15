import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:*/

        Locale.setDefault(Locale.US);
        Scanner reader =  new Scanner(System.in);

        double valorPorHora, salarioBruto, salarioLiquido, impostoDeRenda, inss, sindicato;
        int horasTrabalahdas;

        System.out.println("Informe o valor da sua hora trabalhada: ");
        valorPorHora =  reader.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horasTrabalahdas =  reader.nextInt();

        salarioBruto = valorPorHora * horasTrabalahdas;

        impostoDeRenda = CalculosDeImpostos.impostoDeRenda(salarioBruto);
        inss = CalculosDeImpostos.INSS(salarioBruto);
        sindicato = CalculosDeImpostos.sindicato(salarioBruto);

        salarioLiquido = salarioBruto - (impostoDeRenda + inss + sindicato);

        System.out.printf("""
                O valor do seu salário bruto do referido mês é de: %.2f, porém foram descontados:
                
                Imposto de Renda: %.2f
                INSS: %.2f
                Sindicato: %.2f
                
                Sendo assim seu salário líquido é de: %.2f
                """, salarioBruto, impostoDeRenda, inss, sindicato, salarioLiquido);

        reader.close();
    }
}