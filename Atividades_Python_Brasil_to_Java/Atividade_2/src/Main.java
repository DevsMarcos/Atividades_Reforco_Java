import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*2. Faça um Programa que peça um número e então mostre a mensagem
        O número informado foi [número].*/

        Scanner reader =  new Scanner(System.in);
        double numero = 0.0;

        System.out.print("Informe um número qualquer: ");
        numero = reader.nextDouble();

        System.out.printf("O número informado foi: %.2f", numero);

        reader.close();
    }
}