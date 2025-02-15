import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3. Faça um Programa que peça dois números e imprima a soma.
        Scanner reader = new Scanner(System.in);

        double n1 = 0.0;
        double n2 = 0.0;
        double soma = 0.0;

        System.out.print("Informe o primeiro nnúmero: ");
        n1 = reader.nextDouble();

        System.out.print("Informe o segundo número: ");
        n2 = reader.nextDouble();

        soma = n1 +  n2;

        System.out.printf("A soma dos dosi números é de: %.2f", soma);

        reader.close();
    }
}