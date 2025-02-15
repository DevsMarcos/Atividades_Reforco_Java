import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double area, dobro;

        System.out.print("Informe o valor do lado do quadrado: ");
        area = Math.pow(reader.nextDouble(), 2);
        dobro = area*2;

        System.out.printf("A área do quadrado é de: %.1f e o seu dobro é de: %.1f", area, dobro);
    }
}