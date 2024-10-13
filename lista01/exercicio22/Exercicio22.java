package lista01.exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        int x = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja conferir a soma de todos os numeros ate ele");
        int n = teclado.nextInt();
        for (int i = 0; i <= n ; i++){
            x = x + i;
        }
        System.out.println("A soma de todos os numeros ate "+n+ " e: "+ x);

    }
}
