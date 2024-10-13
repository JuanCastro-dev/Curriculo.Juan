package lista01.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dividendo");
        int n1 = teclado.nextInt();
        System.out.println("Digite o divisor");
        int n2 = teclado.nextInt();

        float Q = n1/n2;
        int R = n1%n2;

        System.out.println("Quociente = "+Q  + "\nResto = " + R);


    }
}
