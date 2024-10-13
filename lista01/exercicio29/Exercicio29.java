package lista01.exercicio29;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja conferir se e perfeito");
        int n = teclado.nextInt();
        for (int i = 1; i<n; i++){
            if (n%i == 0)
                soma = soma + i;
        }
        if (soma == n)
            System.out.println(n +" e um numero perfeito.");
        else
            System.out.println(n+ " nao e um numero perfeito.");
    }
}
