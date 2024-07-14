//Faça um programa que leia a idade de três pessoas e informe quantas delas são
//maiores de idade (idade maior ou igual a 18).



import java.util.Scanner;

public class Quest020 {
    public static void main(String[] args) {

        int idade1, idade2, idade3, cont;
        cont = 0;

        try (Scanner coringa = new Scanner(System.in)){

            System.out.print("Digite a idade da primeira pessoa: ");
            idade1 = coringa.nextInt();

            System.out.print("Digite a idade da segunda pessoa: ");
            idade2 = coringa.nextInt();

            System.out.print("Digite a idade da terceira pessoa: ");
            idade3 = coringa.nextInt();
        }
        if (idade1 >= 18) {
            cont++;
        }
        if (idade2 >= 18) {
            cont++;
        }
        if (idade3 >= 18) {
            cont++;
        }
        
        if (cont == 1) {
            System.out.println("Das três pessoas, " + cont + " é maior de idade.");
        }else{
            System.out.println("Das três pessoas, " + cont + " são maiores de idade.");
        }
        

    }
}