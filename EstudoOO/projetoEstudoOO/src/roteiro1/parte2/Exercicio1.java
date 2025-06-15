package roteiro1.parte2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHoras, valorHorasExtras, salarioTotal,sb;
        int numHorasExtras = 10;

        System.out.println("Informe o salário: ");
        sb = sc.nextInt();
        valorHoras = sb/ 160;
        
        valorHorasExtras = valorHoras * numHorasExtras;
        salarioTotal = sb + valorHorasExtras;

        System.out.println(salarioTotal);

        sc.close();
    }
}
