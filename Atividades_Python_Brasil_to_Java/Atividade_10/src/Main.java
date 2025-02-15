import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        double temperaturaCelsius, temperaturaCovnertida;

        System.out.print("Informe a temperatura em Celsius que deesejas converter para Fahrenheit: ");
        temperaturaCelsius = reader.nextDouble();

        temperaturaCovnertida = conversorCelsiusparaFahrenheit(temperaturaCelsius);

        System.out.printf("A temperatura de %.2f graus Celsius em Fahrenheit é de: %.1f° Fahrenheit", temperaturaCelsius, temperaturaCovnertida);


    }

    public static double conversorCelsiusparaFahrenheit(double tempC) {
        return tempC * 1.8 + 32;
    }
}
