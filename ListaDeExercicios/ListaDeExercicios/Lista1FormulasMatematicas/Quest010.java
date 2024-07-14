//Escreva um programa que calcule o perímetro e a área de um triângulo.
//(Fórmulas: A= (b * h) / 2, P= a + b + c).

import java.util.Scanner;

public class Quest010 {
    public static void main(String[] args) {

        double a,b,c,h;
        double area, perimetro;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite o valor do lado a: ");
            a = coringa.nextDouble();

            System.out.print("Digite o valor do lado b: ");
            b = coringa.nextDouble();

            System.out.print("Digite o valor do lado c: ");
            c = coringa.nextDouble();

            System.out.print("Digite a altura do triângulo em relação ao lado b: ");
            h = coringa.nextDouble();

        }

        area = (b * h) / 2;

        perimetro = a + b + c;


        System.out.printf("Área do triângulo: %.2f\n", area);
        System.out.printf("Perímetro do triângulo: %.2f\n", perimetro);

    }
}