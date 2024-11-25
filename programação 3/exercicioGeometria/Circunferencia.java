package exercicioGeometria;

public class Circunferencia extends FiguraGeometrica2D {
    private float raio;

    public Circunferencia(Ponto2D ponto, float raio) {
        super(null);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

}
