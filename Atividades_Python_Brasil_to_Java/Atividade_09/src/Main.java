import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*9. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).*/
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double temperaturaFahrenheit, temperaturaCovnertida;

        System.out.print("Informe a temperatura em Fahrenheit que deesejas converter: ");
        temperaturaFahrenheit = reader.nextDouble();

        temperaturaCovnertida = conversorFahrenheitparaCelisus(temperaturaFahrenheit);

        System.out.printf("A temperatura de %.2f graus Fahrenheit em Celsius é de: %.2f° Celisus", temperaturaFahrenheit,temperaturaCovnertida);



    }

    public static double conversorFahrenheitparaCelisus(double tempF){
        return (tempF - 32)/1.8;
    }
}