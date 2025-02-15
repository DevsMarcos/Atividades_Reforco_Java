import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte
        fórmula: (72.7*altura) - 58*/

        Locale.setDefault(Locale.US);
        Scanner reader =  new Scanner(System.in);
        double altura;

        System.out.print("Informe a sua altura atual: ");
        altura = reader.nextDouble();

        System.out.printf("Seu peso ideal, conforme sua altura, seria de: %.2f", pesoIdeal(altura));

        reader.close();
    }

    public static double pesoIdeal(double altura){
        return (72.7 * altura) - 58;
    }
}