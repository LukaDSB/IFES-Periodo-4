package Ex03;

/* Crie uma classe chamada “Retângulo” que possua atributos}
para armazenar a base e a altura. Implemente métodos para
calcular a área e o perímetro do retângulo.*/

public class Retangulo {
    private float base;
    private float altura;
    
    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea(){
        return (base*altura)/2;
    }

    public float calcularPerimetro(){
        return base * 3;
    }

    public float getBase(){
        return base; 
    }

    public float getAltura(){
        return altura;
    }
}
