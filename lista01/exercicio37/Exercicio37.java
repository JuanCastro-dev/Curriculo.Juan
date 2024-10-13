package lista01.exercicio37;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v[][] = new int[3][3];
        int t[][] = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite o elemento da linha "+(i+1)+" e coluna "+(j+1)+" da matriz");
                v[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                t[j][i] = v[i][j];
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Matriz original - elemento da linha "+(i+1)+" coluna: "+(j+1) +" = "+ v[i][j]);
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Matriz transposta - elemento da linha "+(i+1)+" coluna: "+(j+1) +" = "+ t[i][j]);
            }
        }
    }
}
