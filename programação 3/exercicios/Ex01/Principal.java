package Ex01;
public class Principal {
    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo(Float.parseFloat(args[0]));
        System.out.println("Area do circulo: " + novoCirculo.calcularArea());
        System.out.println("Perímetro do circulo: " + novoCirculo.calcularPerimetro());
    }
}