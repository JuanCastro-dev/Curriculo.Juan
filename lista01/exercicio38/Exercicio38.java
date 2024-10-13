package lista01.exercicio38;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v[][] = new int[4][4];
        int sum = 0;
        for (int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.println("Digite o elemento da linha: "+(i+1)+", coluna: "+(j+1));
                v[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j)
                    sum = sum + v[i][j];
            }
        }
        System.out.println("A soma dos valores da diagonal pincipal da matriz = "+sum);
    }
}
