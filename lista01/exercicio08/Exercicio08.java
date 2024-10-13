package lista01.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a altura do retangulo");
        float H = teclado.nextFloat();
        System.out.println("Digite a base do retangulo");
        float B = teclado.nextFloat();

        float A = B*H;

        System.out.println("Area do retangulo: "+A);

    }
}
