package lista01.exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu peso");
        float P = teclado.nextFloat();
        System.out.println("Digite a sua altura");
        float A = teclado.nextFloat();
        double imc = P / (A*A);
        if (imc < 18.5)
            System.out.println("abaixo do peso");
        else if (imc >= 18.5 && imc < 25.0)
            System.out.println("peso adequado");
        else
            System.out.println("acima do peso");


    }
}
