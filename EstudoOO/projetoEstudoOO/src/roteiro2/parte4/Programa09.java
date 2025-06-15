package roteiro2.parte4;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetorNotas = new int[5];
        int cont = 0;
        int nota;

        while(cont < vetorNotas.length){
            System.out.println("Informe uma nota entre 0 e 10: ");
            nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10){
                vetorNotas[cont] = nota;
                cont++;
            }else{
                System.out.println("Nota inválida. Tente novamente");
            }
        }
        System.out.println("\nNotas informadas: ");
        for (int i = 0; i < vetorNotas.length; i++){
            System.out.println("Nota " + (i + 1) + "=" + vetorNotas[i]);
        }
        entrada.close();
    }
}