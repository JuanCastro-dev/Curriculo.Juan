package lista01.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero da comparacao");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero da comparacao");
        int n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero da comparacao");
        int n3 = teclado.nextInt();
        if (n1>n2 && n1>n3)
            System.out.println(n1+ " e o maior numero");
        else if (n2>n1 && n2>n3)
            System.out.println(n2+ " e o maior numero");
        else
            System.out.println(n3+ " e o maior numero");
    }
}
