package lista01.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade em anos");
        int A = teclado.nextInt();
        int D = A * 365;

        System.out.println("Sua idade convertida e de "+ D +" dias.");
    }
}
