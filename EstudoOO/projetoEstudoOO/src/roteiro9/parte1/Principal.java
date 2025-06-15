package roteiro9.parte1;

public class Principal {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.5, 6.4);
        Quadrado quadrado = new Quadrado(4);
        
        System.out.println("Area do retangulo: " + retangulo.getArea());
        System.out.println("Perimetro do retangulo: " + retangulo.getPerimetro());
    
        System.out.println("Area do quadrado: " + quadrado.getArea());
        System.out.println("Perimetro do quadrado: " + quadrado.getPerimetro());
    
    }

}
