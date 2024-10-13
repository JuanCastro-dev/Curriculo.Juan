package lista01.exercicio39;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v1[][] = new int[2][2];
        int v2[][] = new int[2][2];
        int m[][] = new int[2][2];
        for (int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.println("Digite o elemento da primeira matriz - linha: "+(i+1)+", coluna: "+(j+1));
                v1[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.println("Digite o elemento da segunda matriz - linha: "+(i+1)+", coluna: "+(j+1));
                v2[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                m[i][j] = v1[i][j] * v2[j][i];
                System.out.println("O elemento da matriz multiplicada - linha: "+(i+1)+", coluna: "+(j+1) +" = "+m[i][j]);
            }
        }
    }
}
