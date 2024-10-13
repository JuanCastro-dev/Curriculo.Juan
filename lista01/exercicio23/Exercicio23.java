package lista01.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        int x = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja calcular o fatorial");
        int n = teclado.nextInt();
        for (int i = n; i>0;i--){
            x = x * i;
        }
        System.out.println(n+"! = "+x );
    }
}
