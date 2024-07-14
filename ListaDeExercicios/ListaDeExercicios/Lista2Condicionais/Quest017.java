//Faça um programa que leia três números, e informe se a soma deles é divisível
//por 5 ou não.

import java.util.Scanner;

public class Quest017 {
    public static void main(String[] args) {

        int n1, n2, n3, soma;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite o primeiro número: ");
            n1 = coringa.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = coringa.nextInt();

            System.out.print("Digite o terceiro número: ");
            n3 = coringa.nextInt();
        }

        soma = n1 + n2 + n3;


        if (soma % 5 == 0) {
            System.out.println("A soma dos números " + n1 + ", " + n2 + " e " + n3 + " é divisível por 5.");
        } else {
            System.out.println("A soma dos números " + n1 + ", " + n2 + " e " + n3 + " não é divisível por 5.");
        }

    }
}