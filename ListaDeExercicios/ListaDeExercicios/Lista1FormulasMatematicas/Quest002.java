//Escreva um programa que calcule a média aritmética de dois números

import java.util.Scanner;

public class Quest002 {
    public static void main(String[] args) {

        double a, b;
        double media;
        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite um numero: ");
            a = coringa.nextDouble();
            
            System.out.println("digite outro numero: ");
            b = coringa.nextDouble();
        }

        media = (a + b) / 2;

        System.out.println("Sua media é : " + media);
    }

}
