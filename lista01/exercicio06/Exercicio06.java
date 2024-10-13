package lista01.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas");
        int H = teclado.nextInt();
        System.out.println("Digite o salario por hora");
        float S = teclado.nextFloat();

        float SH = S*H;
        System.out.println("O valor do salario e: "+ SH);

    }
}
