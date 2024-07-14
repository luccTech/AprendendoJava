//Escreva um programa que leia dois números e informe qual é o maior.



import java.util.Scanner;

public class Quest012 {
    public static void main(String[] args) {

        double n1, n2;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite o primeiro numero: ");
            n1 = coringa.nextDouble();

            System.out.println("digite o segundo numero: ");
            n2 = coringa.nextDouble();
            
        }
        if (n1 > n2) {
            System.out.println("o primeiro numero e o maior que o segundo");
        }else{
            if (n2 > n1) {
                System.out.println("o segundo numero e o maior que o primeiro");
            }else{
                System.out.println("os numeros são iguais");
            }
        }

        
    }
}
