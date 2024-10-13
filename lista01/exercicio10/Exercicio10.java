package lista01.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor monetario em dolares");
        float D = teclado.nextFloat();
        double R = D * 5.58;
        System.out.println("O valor convertido para reais e: R$ "+R);

    }

}
