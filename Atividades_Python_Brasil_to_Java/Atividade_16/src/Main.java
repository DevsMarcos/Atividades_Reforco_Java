import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere
que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.*/
        Locale.setDefault(Locale.US);
        Scanner reader =  new Scanner(System.in);

        double areaAserPintada, quantidadeDeTinta, valorTotal;
        int latasNecessarias;
        final double coberturaPorLitro = 3; // 1 litro cobre 3 metros quadrados
        final double capacidadeLata = 18; // Cada lata tem 18 litros
        final double precoLata = 80.00; // O preço de cada lata é R$ 80,00

        System.out.println("Infome a a área a ser pintada em metros quadrados: ");
        areaAserPintada = reader.nextDouble();

        quantidadeDeTinta = areaAserPintada/coberturaPorLitro;
        latasNecessarias =  (int) Math.ceil(quantidadeDeTinta / capacidadeLata);
        valorTotal = latasNecessarias * precoLata;

        System.out.printf("Para a área de %.2f metros quadrados, é necessário %d latas de tinta, totalizando: R$ %.2f", areaAserPintada,latasNecessarias, valorTotal);



        reader.close();
    }
}