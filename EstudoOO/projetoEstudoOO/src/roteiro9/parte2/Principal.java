package roteiro9.parte2;

public class Principal {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.5, 6.4);
        Quadrado quadrado = new Quadrado(4);
        Circulo circulo = new Circulo(4.6);
        
        System.out.println("*********************************");
        System.out.println("Area do retangulo: " + retangulo.getArea());
        System.out.println("Perimetro do retangulo: " + retangulo.getPerimetro());
        System.out.println("*********************************");

        
        System.out.println("Area do quadrado: " + quadrado.getArea());
        System.out.println("Perimetro do quadrado: " + quadrado.getPerimetro());
        System.out.println("*********************************");

        
        System.out.println(String.format("Area do circulo: %.2f", circulo.getArea()));
        System.out.println(String.format("Perimetro do circulo: %.2f", circulo.getPerimetro()));
        System.out.println("*********************************");


    }

}
