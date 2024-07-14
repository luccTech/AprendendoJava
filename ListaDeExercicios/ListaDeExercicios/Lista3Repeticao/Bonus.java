import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        String nome;
        
        try (Scanner coringa = new Scanner(System.in)){

            System.out.println("Vou advinhar seu nome : ");
            System.out.println("--------------------- : ");

            System.out.println("Digite seu nome : ");

            nome = coringa.next();
        }

        nome = "Hello, World!";

        System.out.println("Seu nome é " + nome);

    }
}






//kkkkkk