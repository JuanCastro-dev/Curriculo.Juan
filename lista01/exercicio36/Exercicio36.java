package lista01.exercicio36;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner teclado = new Scanner(System.in);
        int v[][] = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite o elemento da linha "+(i+1)+" e coluna "+(j+1)+" da matriz");
                v[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + v[i][j];
            }
        }
        System.out.println("Soma dos elementos da matriz = "+sum);
    }
}
