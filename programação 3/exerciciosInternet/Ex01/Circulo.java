package Ex01;
//Crie uma classe chamada “Círculo” que possua um atributo para armazenar o raio e métodos para calcular a área e o perímetro do círculo.

public class Circulo{
    private float raio;

    public Circulo(float raio){
        this.raio = raio;
    }

    public float calcularArea(){
        return 3.14f * (raio*raio);
    }

    public float calcularPerimetro(){
        return 2f * 3.14f * raio;
    }
}