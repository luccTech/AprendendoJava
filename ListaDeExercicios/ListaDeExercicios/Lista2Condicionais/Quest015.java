//Faça um programa que leia um número e informe se ele é positivo, negativo ou
//zero.

import java.util.Scanner;

public class Quest015 {
    public static void main(String[] args) {
        double numero;

        try (Scanner coringa = new Scanner(System.in)){

        System.out.print("Digite um número: ");
        numero = coringa.nextDouble();

        }
        if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo.");
        } else {
            System.out.println("O número digitado é zero.");
        }
    }
}