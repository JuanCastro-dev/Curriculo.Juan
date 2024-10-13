package lista01.exercicio34;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        int v[] = new int[30];
        for (int i = 0; i <30; i++) {
            System.out.println("Digite um numero do vetor");
            v[i] = teclado.nextInt();
        }
        for (int i = 0; i < 30; i++) {
            if (v[i]%2 == 0)
                cont = cont + 1;
        }
        System.out.println(cont+" números pares estão presentes no vetor");
    }
}
