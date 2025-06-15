package roteiro8.parte3;

public class Principal {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente("Enzo", "129920-32", "2321334", "Rua 2", "gamesfodas2@gmail.com");

        VeiculoPasseio novoVeiculo = new VeiculoPasseio("123213234", 2006, 2);

        novoCliente.setVeiculo(novoVeiculo);

        System.out.println("O cliente: " + novoCliente.getNome() + " tem o veiculo de placa: " + novoVeiculo.getPlaca());

    }
}
