package roteiro6.parte3;

public class Ligacao {
    private String numOrigem;
    private String numDestino;
    private String localOrigem;
    private String localDestino;
    private Tempo horaInicio;
    private Tempo horaFim;
    
    private static double valorPorMinuto = 1.00;

    public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, Tempo horaInicio) {
        this.numOrigem = numOrigem;
        this.numDestino = numDestino;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.horaInicio = horaInicio;
        this.horaFim = null;

    }

    public String getNumOrigem() {
        return numOrigem;
    }

    public void setNumOrigem(String numOrigem) {
        this.numOrigem = numOrigem;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(String numDestino) {
        this.numDestino = numDestino;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public Tempo getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Tempo getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

    public void verificarNumero(String numero) {
        if (numero.equals(numOrigem) || numero.equals(numDestino)) {
            System.out.println("O número informado é igual ao numero de origem ou é igual ao número de destino");
            System.out.println(numero);
        }
    }

    public static void setValorPorMinuto(double valor){
        valorPorMinuto = valor;

    }

    public double calcularValor(){
        return (double) horaInicio.calcularDiferenca(horaFim) * valorPorMinuto;
        
    }

    public double calcularValorComArredondamento() {
    if (horaInicio == null || horaFim == null) {
        throw new IllegalStateException("Hora de início ou fim não pode ser nula");
        }

        int inicioSegundos = horaInicio.getHora() * 3600 + horaInicio.getMinuto() * 60 + horaInicio.getSegundo();
        int fimSegundos = horaFim.getHora() * 3600 + horaFim.getMinuto() * 60 + horaFim.getSegundo();

        int diferencaSegundos = fimSegundos - inicioSegundos;
        
        if (diferencaSegundos <= 0) {
            return 0.0;
        }

        int minutosCobrados = (int) Math.ceil(diferencaSegundos / 60.0);

        return minutosCobrados * valorPorMinuto;
    }

}
