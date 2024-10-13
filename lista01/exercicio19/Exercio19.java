package lista01.exercicio19;

import java.util.Scanner;

public class Exercio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        float p = teclado.nextFloat();
        System.out.println("Digite a porcentagem do desconto");
        float d = teclado.nextFloat()/100;
        double valor = p-(p*d);
        System.out.println("O valor do produto com o desconto vai para: R$ "+valor);
    }
}
