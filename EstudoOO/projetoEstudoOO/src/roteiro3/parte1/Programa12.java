package roteiro3.parte1;

import java.util.Scanner;

public class Programa12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sb, sr;

        System.out.println("Informe o Salário Base: ");
        sb = entrada.nextDouble();
        
        sr = Programa12.calclmp(sb);

        System.out.println("Salário a receber: "  + sr);

        entrada.close();
    }

    public static double calclmp(double sb) {
        double grat = sb * 5 / 100;
        double imp = sb * 7 / 100;
        return sb + grat - imp;
    }
}
