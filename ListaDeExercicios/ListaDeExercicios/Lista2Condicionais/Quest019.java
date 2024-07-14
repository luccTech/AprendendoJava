//Faça um programa que leia três números, e mostre eles na tela em ordem
//crescente.


import java.util.Scanner;

public class Quest019 { // essa eu achei mais complicada
     public static void main(String[] args) {


        int n1,n2,n3,temp;


        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite o primeiro número: ");
            n1 = coringa.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = coringa.nextInt();

            System.out.print("Digite o terceiro número: ");
            n3 = coringa.nextInt();

        }

        if (n1 > n2) {   // que questão em kkkkkkk
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 > n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        System.out.println("Números em ordem crescente: " + n1 + ", " + n2 + ", " + n3);

    }
}