package roteiro8.parte2;

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

    @Override
    public double calcPedagio(){
        super.taxaPedagio = 2.0;
        return super.taxaPedagio * this.qtddeMaxPassageiros;
    }
}
