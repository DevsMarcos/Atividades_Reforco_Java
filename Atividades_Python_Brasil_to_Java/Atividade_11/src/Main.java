import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//        a. o produto do dobro do primeiro com metade do segundo .
//        b. a soma do triplo do primeiro com o terceiro.
//        c. o terceiro elevado ao cubo.
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        double n1, n2;
        float n3;

        System.out.print("Informe o valor do primeiro número: ");
        n1 = reader.nextDouble();

        System.out.print("Informe o valor do segundo número: ");
        n2 = reader.nextDouble();

        System.out.print("Informe o valor do terceiro número: ");
        n3 = reader.nextFloat();

        System.out.println((n1*2)*(n2/2));
        System.out.println((n1*3) + n3);
        System.out.println(n3 * 3);

        reader.close();
    }
}