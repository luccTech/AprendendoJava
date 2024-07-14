



import java.util.Scanner;

public class Quest018 {
    public static void main(String[] args) {

        double n1,n2,n3,soma;

        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("Digite o primeiro número: ");
            n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            n2 = scanner.nextDouble();

            System.out.print("Digite o terceiro número: ");
            n3 = scanner.nextDouble();
        }
        soma = n1 + n2 + n3;

        if (soma > 0) {
            System.out.println("A soma dos números é positiva.");
        } else if (soma < 0) {
            System.out.println("A soma dos números é negativa.");
        } else {
            System.out.println("A soma dos números é igual a zero.");
        }
    }
}