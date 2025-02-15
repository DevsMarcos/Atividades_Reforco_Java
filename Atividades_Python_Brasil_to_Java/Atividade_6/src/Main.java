import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double raio, area;
        System.out.printf("Informe o valor do raio do circulo: ");
        raio = reader.nextDouble();

        area = Math.pow(raio, 2) * Math.PI;

        System.out.printf("A área do círculo é de: %.2f", area );

    }
}