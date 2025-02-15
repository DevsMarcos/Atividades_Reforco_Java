import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        // Calcule e mostre o total do seu salário no referido mês.

        Locale.setDefault(Locale.US);
        Scanner reader =  new Scanner(System.in);

        double valorDaHora, totalNoMes;
        int horasMensais;

        System.out.print("Informe o valor da sua hora trabalhada: ");
        valorDaHora =  reader.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        horasMensais = reader.nextInt();

        totalNoMes = valorDaHora*horasMensais;

        System.out.printf("O valor do seu sálario no referido mês é de: %.2f", totalNoMes );

        reader.close();

    }
}