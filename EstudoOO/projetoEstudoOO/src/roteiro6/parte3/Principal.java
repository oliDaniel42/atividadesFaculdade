package roteiro6.parte3;

public class Principal {
    public static void main(String[] args) {
        Tempo inicio = new Tempo(10, 15, 0); // 10:15:00
        Tempo fim = new Tempo(14, 45, 0);    // 10:45:00

        Ligacao ligacao = new Ligacao("123", "456", "SP", "RJ", inicio);
        ligacao.setHoraFim(fim);
        System.out.println("Valor: " + ligacao.calcularValorComArredondamento());
    }
}
