//Crie um programa que calcule e exiba a média aritmética de três notas
//informadas pelo usuário.


import java.util.Scanner;

public class Quest003 {
    public static void main(String[] args) {

        double n1, n2, n3;
        double media;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite sua primeira nota: ");
            n1 = coringa.nextDouble();
            
            System.out.println("digite sua segunda nota: ");
            n2 = coringa.nextDouble();

            System.out.println("digite sua terceira nota: ");
            n3 = coringa.nextDouble();
        }

        media = (n1 + n2 + n3) / 3;

        System.out.println("Sua media é : " + media);
    }
}
