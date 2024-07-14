//Escreva um programa que calcule o IMC de um indivíduo. (Fórmula: peso /
//Math.pow(altura,2)).



import java.util.Scanner;

public class Quest005 {
    public static void main(String[] args) {

        double peso, altura;
        double imc;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite seu peso: ");
            peso = coringa.nextDouble();
            
            System.out.println("digite sua altura,(use virgula): ");
            altura = coringa.nextDouble();
        }

        imc = (peso /Math.pow(altura,2));

        System.out.println("Seu imc é : " + imc);
    }
}
