//Faça um programa que calcule e exiba a soma dos números pares de 1 a 100
//utilizando um laço de repetição




public class Quest028 {
    public static void main(String[] args) {


        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}