package lista01.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        int l1 = teclado.nextInt();
        System.out.println("Digite o segundo lado do triangulo");
        int l2 = teclado.nextInt();
        System.out.println("Digite o terceiro lado do triangulo");
        int l3 = teclado.nextInt();
        if (l1 == l2 && l2 == l3)
            System.out.println("Triangulo equilatero");
        else if (l1 != l2 && l2 != l3)
            System.out.println("Triangulo escaleno");
        else
            System.out.println("Triangulo isoceles");



    }
}
