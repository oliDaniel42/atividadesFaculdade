package roteiro8.parte1;

public class VeiculoPasseio extends Veiculo{
    private int qtddeMaxPassageiros;

    public VeiculoPasseio(String placa, int anoFabricacao, int qtddeMaxPassageiros) {
        super(placa, anoFabricacao);
        this.qtddeMaxPassageiros = qtddeMaxPassageiros;
    }

    public int getQtddeMaxPassageiros() {
        return qtddeMaxPassageiros;
    }

    public void setQtddeMaxPassageiros(int qtddeMaxPassageiros) {
        this.qtddeMaxPassageiros = qtddeMaxPassageiros;
    }
}
