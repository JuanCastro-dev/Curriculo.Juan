package lista01.exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        double N = teclado.nextDouble();
        if (N < 0)
            System.out.println("Negativo");
        else if (N > 0)
            System.out.println("Positivo");
        else
            System.out.println("Zero");

    }
}
