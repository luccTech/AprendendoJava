//Escreva um programa que solicite três números ao usuário e exiba o maior
//deles.



import java.util.Scanner;

public class Quest013 {
    public static void main(String[] args) {

        double n1, n2, n3;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite o primeiro numero: ");
            n1 = coringa.nextDouble();

            System.out.println("digite o segundo numero: ");
            n2 = coringa.nextDouble();

            System.out.println("digite o terceiro numero: ");
            n3 = coringa.nextDouble();
            
        }
        if ((n1 > n3) && (n1 > n2)) {
            System.out.println("o primeiro numero e o maior");
        }else{
            if ((n2 > n1) && (n2 > n3)) {
                System.out.println("o segundo numero e o maior");
            }else{
                if ((n3 > n1) && (n3 > n2)) {
                    System.out.println("o terceiro numero e maior");
                }else{
                    System.out.println("alguns numeros são iguais");
                }
            }
        }

        
    }
}
