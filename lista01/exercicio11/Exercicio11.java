package lista01.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja conferir se e impar ou par");
        int N = teclado.nextInt();
        if ( N%2 == 0 ){
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }

    }
}
