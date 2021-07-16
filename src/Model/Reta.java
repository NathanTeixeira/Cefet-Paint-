package Model;

public class Reta {

    private Ponto pontoInicio;
    private Ponto pontoFim;

    public Reta() {
        this.pontoInicio = new Ponto(0,0);
        this.pontoFim = new Ponto(0,5);
    }

    public Reta(Ponto pontoInicio, Ponto pontoFim) {
        this.pontoInicio = pontoInicio;
        this.pontoFim = pontoFim;
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
