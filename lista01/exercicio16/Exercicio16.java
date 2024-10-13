package lista01.exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano que deseja conferir");
        int ano = teclado.nextInt();

        if ((ano%4) == 0 )
            System.out.println("Ano bissexto");
        else
            System.out.println("Nao e bissexto");
    }
}
