package lista01.exercicio21;

import java.util.Scanner;

public class Exercio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja conferir a tabuada");
        int n = teclado.nextInt();
        for (int i = 1;i<11;i++){
            int x = n*i;
            System.out.println(n+" * " + i+ " = "+x);
        }
    }
}
