//Escreva um programa que calcule o perímetro e a área de um retângulo.
//(Fórmulas: A= l * c, P= 2*(l + c)).

import java.util.Scanner;

public class Quest009 {
    public static void main(String[] args) {

        double c, l;
        double A, P;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite o comprimento do retângulo: ");
            c = coringa.nextDouble();

            System.out.print("Digite a largura do retângulo: ");
            l = coringa.nextDouble();
        }

        A = c * l;

        P = 2 * (c + l);

        System.out.printf("Área do retângulo: %.2f\n", A);
        System.out.printf("Perímetro do retângulo: %.2f\n", P);

    }
}