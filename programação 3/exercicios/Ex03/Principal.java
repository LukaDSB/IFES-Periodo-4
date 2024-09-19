package Ex03;

public class Principal {
    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo(Float.parseFloat(args[0]), Float.parseFloat(args[1]));

        System.out.println("Base: " + novoRetangulo.getBase() + "\nAltura: " + novoRetangulo.getAltura() + "\n\n");
        System.out.println("Area: " + novoRetangulo.calcularArea() + "\nPerimetro: " + novoRetangulo.calcularPerimetro() + "\n\n");
    }
}
