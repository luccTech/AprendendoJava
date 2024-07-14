// Faça um programa que leia um número e informe se ele é par ou ímpar

import java.util.Scanner;

public class Quest014 {
    public static void main(String[] args) {

        int numero;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite um número inteiro: ");
            numero = coringa.nextInt();

        }
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
    }
}