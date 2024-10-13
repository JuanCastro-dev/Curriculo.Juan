package lista01.exercicio25;

public class Exercicio25 {
    public static void main(String[] args) {
        int n = 1;
        while (n < 101){
            if (n%3 == 0 || n%5 == 0)
                System.out.println(n);
            n++;
        }
    }
}
