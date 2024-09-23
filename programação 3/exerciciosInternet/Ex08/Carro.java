package Ex08;

/*Implemente uma classe chamada ?Carro? com atributos para 
armazenar a marca, o modelo e a velocidade atual do carro. 
Adicione m�todos para acelerar, frear e exibir a velocidade atual. */

public class Carro {
    private String marca;
    private String modelo;
    private float velocidade;

    public Carro(String marca, String modelo, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(float vel){
        velocidade += vel;
    }

    public void frear(float vel){
        velocidade -= vel;
    }
 
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public float getVelocidade(){
        return velocidade;
    }
}
