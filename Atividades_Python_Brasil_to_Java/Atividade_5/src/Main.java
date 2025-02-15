import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5. Faça um Programa que converta metros para centímetros.
        Locale.setDefault(Locale.US);
        Scanner reader =  new Scanner(System.in);

        double metros, conversao;

        System.out.print("Informe um valor em metros: ");
        metros = reader.nextDouble();

        conversao = metros * 100;

        System.out.printf("O valor de "+metros+" em CM é de: "+conversao+" CM");
    }
}