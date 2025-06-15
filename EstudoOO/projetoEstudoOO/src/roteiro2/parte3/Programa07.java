package roteiro2.parte3;

import java.util.Scanner;

public class Programa07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;
        int cont = 0; 
        float somaMedia = 0, media = 0;

        do {
            System.out.print("Informe uma nota: ");
            int nota = entrada.nextInt();

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            cont++;

            entrada.nextLine(); // Limpa o buffer
            System.out.print("Deseja parar? (s/n): ");
            resposta = entrada.nextLine().trim().toLowerCase();
            somaMedia += nota;
            media = somaMedia / cont;

        } while (!resposta.equals("s"));
        System.out.println("Media do aluno: "+ media);

        entrada.close();
    }
}
