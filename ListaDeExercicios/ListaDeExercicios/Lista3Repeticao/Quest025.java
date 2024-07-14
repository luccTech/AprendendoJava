//Faça um programa que leia um número e exiba a tabuada desse número
//tilizando laço de repetição.




import java.util.Scanner;

public class Quest025 {
    public static void main(String[] args) {

        int n;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite um número: ");
            n = coringa.nextInt();
        }           
        System.out.println("Tabuada de " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

