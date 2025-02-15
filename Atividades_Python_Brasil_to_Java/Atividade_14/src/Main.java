import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez
que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e
calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João
deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

        Locale.setDefault(Locale.US);
        Scanner reader =  new Scanner(System.in);
        double peso, excesso, multa;

        System.out.print("Informe o peso total proveniente da pescaria: ");
        peso =  reader.nextDouble();

        if (peso > 50){
            excesso = peso - 50;
            multa = excesso * 4.00;

            System.out.printf("O peso excendete é de %.2f Kg, sendo assim a multa a ser paga é de: R$ %.2f", excesso, multa);
        }else {
            System.out.println("Pescaria em ordem, boa viagem! ");
        }

    }
}