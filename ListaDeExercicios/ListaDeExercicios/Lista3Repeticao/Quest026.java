
//-Escreva um programa que imprima na tela a tabuada de todos os números de 1
//a 10.


public class Quest026 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada de " + i + ":");
            
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println(); // essa linha so pra organizar
        }
    }
}