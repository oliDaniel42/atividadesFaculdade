package roteiro2.parte1;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        Scanner entradaNome = new Scanner(System.in);
        Scanner entradaIdade = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = entradaNome.nextLine();


        System.out.println("Informe sua idade: ");

        int idade = entradaIdade.nextInt();

        System.out.println("Informações do usuário: " + "Nome: "+ nome +
        " " + "Idade: " + idade);

        entradaNome.close();
        entradaIdade.close();
    }
}
