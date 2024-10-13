package lista01.exercicio27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja conferir a soma dos numeros pares ate ele");
        int n = teclado.nextInt();
        for (int i = 1; i<= n; i++){
            if (i%2 == 0)
                soma = soma + i;
        }
        System.out.println("A soma dos numeros pares ate "+n+" e igual a "+soma);
    }
}
