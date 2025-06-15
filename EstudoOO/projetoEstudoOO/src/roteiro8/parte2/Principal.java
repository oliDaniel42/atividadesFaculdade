package roteiro8.parte2;

public class Principal {
    public static void main(String[] args) {
        VeiculoCarga v02 = new VeiculoCarga("222222-BA", 2012, 5000);
        VeiculoPasseio v03 = new VeiculoPasseio("333333-BA", 2013, 5);
        VeiculoPequeno v04 = new VeiculoPequeno("444444-BA", 2014, "moto");

        System.out.println("Pedágio v02: " + v02.calcPedagio());
        System.out.println("Pedágio v03: " + v03.calcPedagio());
        System.out.println("Pedágio v04: " + v04.calcPedagio());
    }
}
