import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner reader =  new Scanner(System.in);
        double soma = 0, media;

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o valore da " + (i+1) +"° nota: ");
            soma+= reader.nextDouble();
        }

        media = soma/4;

        System.out.printf("A media das notas é de: %.2f", media);
    }
}