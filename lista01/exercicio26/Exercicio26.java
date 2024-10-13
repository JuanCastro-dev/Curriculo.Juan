package lista01.exercicio26;

import java.util.Scanner;

public class Exercicio26 {

        public static void main (String [] args){
            int y = 0;
            int x = 1;
            Scanner w1 = new Scanner(System.in);
            System.out.println("Escreva os 'N' primeiros numeros da sequencia de Fibonacci que deseja conferir");
            int n = w1.nextInt();

            for (int i = 1; i<=n; i++){
                System.out.println(x);
                i++;
                y = y + x;
                if (i>n)
                    break;
                System.out.println(y);
                x = y + x;
            }
        }
    }