package lista01.exercicio35;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um elemento do primero vetor");
            v1[i] = teclado.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um elemento do segundo vetor");
            v2[i] = teclado.nextInt();
        }
        for (int i = 0; i<5; i++){
            v3[i] = v2[i] * v1[i];
            System.out.println("Elemento resultante "+(i+1)+" = "+v3[i]);
        }
    }
}
