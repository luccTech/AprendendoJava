//Faça um programa que leia as notas de duas provas e informe se o aluno foi
//aprovado, sabendo que para ser aprovado (média maior ou igual a 6) ou
//reprovado (média menor que 6).


import java.util.Scanner;

public class Quest016 {
    public static void main(String[] args) {

        double nota1, nota2, media;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite a nota da primeira prova: ");
            nota1 = coringa.nextDouble();

            System.out.print("Digite a nota da segunda prova: ");
            nota2 = coringa.nextDouble();
        }

        media = (nota1 + nota2) / 2;

        if (media >= 6.0) {
            System.out.println("Parabéns! Você foi aprovado com média " + media);
        } else {
            System.out.println("Infelizmente, você foi reprovado com média " + media);
        }

    }
}