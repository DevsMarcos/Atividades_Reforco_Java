import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes
fórmulas:
a. Para homens: (72.7*h) - 58
b. Para mulheres: (62.1*h) - 44.7*/
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double altura;
        System.out.print("Informe a sua atlura: ");
        altura =  reader.nextDouble();

        System.out.println("O peso ideal baseado na altura, para mulheres é de: " + Calculos.pesoIdealMulheres(altura));
        System.out.println("O peso ideal baseado na altura, para homens é de: " + Calculos.pesoIdealHomens(altura));
    }


}