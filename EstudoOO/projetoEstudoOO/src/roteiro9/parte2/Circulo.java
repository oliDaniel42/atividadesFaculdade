package roteiro9.parte2;

public class Circulo implements FormaGeometrica{
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigura() {
        return "Circulo";
    }

    @Override
    public double getArea() {
    return Math.PI*raio*raio;
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*raio;
    }

}
