package lista01.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero");
        int n3 = teclado.nextInt();
        System.out.println("Digite o quarto numero");
        int n4 = teclado.nextInt();

        float Med = (n1+n2+n3+n4)/4;
        System.out.println("A media dos numeros e: " +Med);
    }
}
