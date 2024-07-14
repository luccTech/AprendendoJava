//-Faça um programa que solicite a idade de uma pessoa e exiba se ela é maior de
//idade ou não.


import java.util.Scanner;

public class Quest011 {
    public static void main(String[] args) {

        double idade;

        try (Scanner coringa = new Scanner(System.in)) {
        
            System.out.println("digite sua idade: ");
            idade = coringa.nextDouble();
            
        }
        if (idade >= 18) {
            System.out.println("olha vc ja e maior de idade : ");
        }else{
            System.out.println("vc ainda e menor de idade : ");
        }

        
    }
}
