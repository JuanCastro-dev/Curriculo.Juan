package lista01.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celcius");
        float C = teclado.nextFloat();
        double F = C * 1.8 + 32;
        System.out.println("A temperatura em Celcius é: " +F);
    }
}
