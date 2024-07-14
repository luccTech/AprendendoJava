//Escreva um programa que calcule a área de um círculo a partir do raio.
//(Fórmula: Math.PI * Math.pow(raio,2)).



import java.util.Scanner;

public class Quest007 {
    public static void main(String[] args) {

        double raio;
        double area;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite um raio de um circulo: ");
            raio = coringa.nextDouble();
            
        }

        area =  (Math.PI * Math.pow(raio,2));

        System.out.println("Seu perimetro é : " + area);
    }
}
