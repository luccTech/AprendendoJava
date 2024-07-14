//Faça um programa que leia um número N, e diga se o mesmo é primo ou não.






import java.util.Scanner;

public class Quest029 {
    public static void main(String[] args) {

        int N;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.println("Digite um número N para verificar se é primo: ");
            N = coringa.nextInt();

        }
        boolean primo = true;

        if (N <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < N; i++) { 
                if (N % i == 0) {  //se N for divisivel por outro numero i, N n e primo
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(N + " é um número primo.");
        } else {
            System.out.println(N + " não é um número primo.");
        }

    }
}