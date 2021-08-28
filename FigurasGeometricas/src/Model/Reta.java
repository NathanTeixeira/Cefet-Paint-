package Model;

public class Reta extends FiguraGeometrica {

    private Ponto pontoInicio;
    private Ponto pontoFim;
    private int fim;

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public Reta() {
        this("RETA", 1);
    }

    public Reta(String id, int fim) {
        setId(id);
        pontoInicio = new Ponto(null, 0, 0);
        pontoFim = new Ponto(null, fim, 0);
        this.setFim(fim);
    }

    public void setLado(String id, int fim) {
        setId(id);
        getPontoFim().setCoordenadaX(fim);
        getPontoFim().setCoordenadaY(0);
    }

    @Override
    public double getArea() {
        return fim;
    }

    @Override
    public double getPerimetro() {
        return fim;
    }

    @Override
    public String getDimensoes() {
        return String.valueOf("TAMANHO: " + fim);
    }

    @Override
    public String getTipo() {
        return "RETA";
    }

    public Ponto getPontoInicio() {
        return pontoInicio;
    }

    public void setPontoInicio(Ponto pontoInicio) {
        this.pontoInicio = pontoInicio;
    }

    public Ponto getPontoFim() {
        return pontoFim;
    }

    public void setPontoFim(Ponto pontoFim) {
        this.pontoFim = pontoFim;
    }

}
