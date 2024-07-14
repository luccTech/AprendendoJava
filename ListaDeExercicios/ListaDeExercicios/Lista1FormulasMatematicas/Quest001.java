//Escreva um programa que solicite ao usuário dois números e exiba a soma,
//subtração, multiplicação e divisão entre eles.


import java.util.Scanner;

public class Quest001 {
    public static void main(String[] args) {

        double a, b;
        double soma, sub, div, mult;
        try (Scanner coringa = new Scanner(System.in)) {  // "prendi a usar o try" : sem o try o objeto Scanner é criado e utilizado, mas não é explicitamente fechado após seu uso. Isso pode levar a problemas de recursos não liberados adequadamente, especialmente em programas maiores ou de longa execução, onde a abertura repetida de recursos não fechados pode causar esgotamento de recursos.
        
            System.out.println("digite um numero: ");
            a = coringa.nextDouble();
            
            System.out.println("digite outro numero: ");
            b = coringa.nextDouble();
        }

        soma = a + b;
        sub = a - b;
        div = a / b;
        mult =a * b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
}
