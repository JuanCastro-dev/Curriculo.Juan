package lista01.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja ver se e multiplo");
        int n1 = teclado.nextInt();
        System.out.println("Digite o numero no qual deseja conferir se o anterior e multiplo dele");
        int n2 = teclado.nextInt();
        if (n1%n2 == 0)
            System.out.println(n1+" e multiplo de "+n2);
        else
            System.out.println(n1+" nao e multiplo de "+n2);

    }
}
