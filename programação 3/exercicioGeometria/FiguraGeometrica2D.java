package exercicioGeometria;

import java.util.List;

public class FiguraGeometrica2D {
    private List<Ponto2D> pontos;

    public FiguraGeometrica2D(List<Ponto2D> pontos) {
        this.pontos = pontos;
    }

    public List<Ponto2D> getPontos() {
        return pontos;
    }

    public void setPontos(List<Ponto2D> pontos) {
        this.pontos = pontos;
    }

}
