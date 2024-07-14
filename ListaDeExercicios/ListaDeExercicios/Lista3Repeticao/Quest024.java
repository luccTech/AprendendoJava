//Crie um programa que exiba os números pares de 1 a 50 e os números
//ímpares de 51 a 100, utilizando um laço de repetição qualquer.



public class Quest024 {
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Números ímpares de 51 a 100:");
        for (int i = 51; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
