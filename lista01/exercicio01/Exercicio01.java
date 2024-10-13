package lista01.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o primeiro número da soma");
            int n1 = teclado.nextInt();
            System.out.println("Digite o segundo número da soma");
            int n2 = teclado.nextInt();

            System.out.println(n1+n2);

    }
}
