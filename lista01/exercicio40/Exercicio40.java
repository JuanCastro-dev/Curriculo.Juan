package lista01.exercicio40;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[10];
        int t[] = new int[10];
        int j = 10;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite o "+(i+1)+ "° elemento do vetor");
            v[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++){
            j--;
            t[j] = v[i];
        }
        for (int i = 0; i < 10; i++){
            System.out.println((i + 1) + "° elemento do vetor trocado = " + t[i]);
        }
    }
}