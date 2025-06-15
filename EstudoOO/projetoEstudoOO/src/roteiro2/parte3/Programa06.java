package roteiro2.parte3;

import java.util.Scanner;

public class Programa06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Informe uma nota: ");
            int nota = entrada.nextInt();

            if (nota >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            entrada.nextLine(); // Limpa o buffer
            System.out.print("Deseja parar? (sim/não): ");
            resposta = entrada.nextLine().trim().toLowerCase();

        } while (!resposta.equals("sim"));

        entrada.close();
    }
}
