package lista01.exercicio33;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero do vetor");
            v[i] = teclado.nextInt();
        }
        for (int i = 0; i < 20; i++){
            sum = sum + v[i];
        }
        double med = sum/20;
        System.out.println("Media dos elementos do vetor: "+med);
    }
}
