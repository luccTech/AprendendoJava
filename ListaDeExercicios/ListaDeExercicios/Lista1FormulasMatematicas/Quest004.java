//Escreva um programa que calcule a média geométrica entre três números
//informados pelo usuário. (Fórmula: Math.pow(numero1 * numero2 * numero3,
//1/3).


import java.util.Scanner;

public class Quest004 {
    public static void main(String[] args) {

        double n1, n2, n3;
        double media;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite o primeiro numero: ");
            n1 = coringa.nextDouble();
            
            System.out.println("digite o segundo numero: ");
            n2 = coringa.nextDouble();

            System.out.println("digite o terceiro numero: ");
            n3 = coringa.nextDouble();
        }

        media = Math.pow(n1 * n2 * n3, 1/3); //segundo o exemplo q o senhor colocou la na lista
        media = Math.cbrt(n1 * n2 * n3); // como o resultado q vai aparecer e o dessa linha, n comentei ele, esse e o jeito q eu pesquisei e vi q deu certo.

        System.out.println("Sua media geometrica é : " + media);
    }
}
