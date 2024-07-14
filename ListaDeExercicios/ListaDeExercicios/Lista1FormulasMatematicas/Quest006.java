//Crie um programa que calcule e exiba o perímetro de um círculo, solicitando o
//raio ao usuário. (Fórmula: 2 * Math.PI * raio).




import java.util.Scanner;

public class Quest006 {
    public static void main(String[] args) {

        double raio;
        double perimetro;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite um raio de um circulo: ");
            raio = coringa.nextDouble();
            
        }

        perimetro =  (2 * Math.PI * raio);

        System.out.println("Seu perimetro é : " + perimetro);
    }
}
