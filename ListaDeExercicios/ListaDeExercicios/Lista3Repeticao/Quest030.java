//Escreva um programa que solicite ao usuário dois números A e B e exiba todos
//os números entre eles.




import java.util.Scanner;

public class Quest030 {
    public static void main(String[] args) {

        int A,B,temp;

        try (Scanner coringa = new Scanner(System.in)){


            System.out.println("Digite o número A: ");
            A = coringa.nextInt();

            System.out.println("Digite o número B: ");
            B = coringa.nextInt();
        }
        
        if (A > B) {    // so um pequeno teste para que A seja menor ou igual a B
            temp = A;  
            A = B;
            B = temp;
        }

        System.out.println("Números entre " + A + " e " + B + ":");
        for (int i = A; i <= B; i++) {
            System.out.println(i);     ///OBS:   se o senhor olhou ate aq olhe a questão bonus q eu fiz!!!!!!!!!!
        }
    }
}
