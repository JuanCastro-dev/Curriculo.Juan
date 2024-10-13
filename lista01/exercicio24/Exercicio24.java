package lista01.exercicio24;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
            int val = 0;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o numero que deseja conferir se e primo");
            int n = teclado.nextInt();
            for (int i = 2; i < n; i++ ){
                int x = n%i;
                if (x == 0) {
                    System.out.println(n + " nao e numero primo");
                    val =+ 1;
                    break;
                } else
                    continue;
            }
            if (val == 0)
                System.out.println(n + " e numero primo");
    }
}
