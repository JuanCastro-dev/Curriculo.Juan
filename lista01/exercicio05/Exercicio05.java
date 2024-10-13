package lista01.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as horasa que deseja converter");
        int H = teclado.nextInt();

        int M = H*60;
        int S =M*60;

        System.out.println("As horas correspondem a "+M+" minutos ou "+ S+ " segundos.");
    }
}
