package lista01.exercicio31;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        int x = 0;
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um numero do vetor");
            v[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++){
            x = x + v[i];
        }
        System.out.println("soma dos elementos do vetor = "+x);
    }
}
