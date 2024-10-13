package lista01.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        float R = teclado.nextFloat();
        double A = 3.14 * (R*R);
        System.out.println("A área do círculo é: " +A);

    }
}
