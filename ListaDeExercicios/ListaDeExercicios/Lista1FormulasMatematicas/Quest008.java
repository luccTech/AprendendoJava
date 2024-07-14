//Escreva um programa que calcule o delta e raízes de uma equação do segundo
//grau.



import java.util.Scanner;

public class Quest008 {
    public static void main(String[] args) {

        double a,b,c, delta, raiz1, raiz2;

        try(Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite o valor de a: ");
            a = coringa.nextDouble();

            System.out.print("Digite o valor de b: ");
            b = coringa.nextDouble();

            System.out.print("Digite o valor de c: ");
            c = coringa.nextDouble();
        }
        delta = b * b - 4 * a * c;

        System.out.printf("Delta: %.2f\n", delta); //aq aprendi q se for usado o printf assim como na liguagem c eu posso formatar o valor.

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raizUnica = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: %.2f\n", raizUnica);
        } else {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f\n", raiz1, raiz2);
        }
    }
}
