package roteiro2.parte4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio{
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        int palpite;
        int numeroSecreto = random.nextInt(100)+1;
        
        System.out.println("Diga um numero: ");
        palpite = entrada.nextInt();
        
        while (palpite != numeroSecreto) {
            if (palpite < numeroSecreto){
                System.out.println("Errado, o numero é maior. Tente novamente");
            } else{
                System.out.println("Errado, o numero é menor. Tente novamente");
            }
            palpite = entrada.nextInt();
        }
        
        System.out.println("Parabéns, você acertou! O número era: " + numeroSecreto);
        entrada.close();
    }
}
