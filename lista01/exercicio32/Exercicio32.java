package lista01.exercicio32;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        int ma = 0;
        int me = 0;
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[15];
        for (int i = 0; i < 15; i++){
            System.out.println("Digite um numero do vetor");
            v[i] = teclado.nextInt();
        }
        for (int i = 0; i < 15; i++){
            if (i == 0)
                ma = v[i];
            else if (ma < v[i])
                ma = v[i];
        }
        for (int i = 0; i < 15; i++){
            if (i == 0)
                me = v[i];
            else if (me > v[i])
                me = v[i];
        }
        System.out.println("Maior numero = "+ma);
        System.out.println("Menor numero = "+me);
    }
}
