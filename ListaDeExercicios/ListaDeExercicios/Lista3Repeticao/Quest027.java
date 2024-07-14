//Escreva um programa que solicite ao usuário um número N e exiba a soma de
//todos os números de 1 a N..





import java.util.Scanner;

public class Quest027 {
    public static void main(String[] args) {

        int N,soma;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.println("Digite um número N: ");
            N = coringa.nextInt();
        }
        soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }

        System.out.println("A soma de todos os números de 1 a " + N + " é " + soma);

    }
}