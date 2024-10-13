package lista01.exercicio30;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        int x = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base da potencia");
        int b = teclado.nextInt();
        System.out.println("Digite o expoente da potencia");
        int e = teclado.nextInt();
        for (int i = 1; i <= e; i++){
            x = x*b;
        }
        System.out.println(b+"^"+e+" = "+x);

    }
}
