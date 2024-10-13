package lista01.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int i = teclado.nextInt();
        if (i>15)
            System.out.println("Voce esta apto a votar");
        else
            System.out.println("Voce nao esta apto a votar");
    }
}
