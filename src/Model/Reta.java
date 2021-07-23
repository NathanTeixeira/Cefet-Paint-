package Model;

public class Reta extends FiguraGeometrica {

    private Ponto pontoInicio;
    private Ponto pontoFim;
    private int inicio;
    private int fim;

    public Reta() {   
        this(0, 1);
    }

    public Reta(int inicio, int fim) {
        pontoInicio = new Ponto(inicio, 0);
        pontoFim = new Ponto(fim, 0);
    }
    
    public void setLado(int inicio, int fim){
        getPontoInicio().setCoordenadaX(inicio);
        getPontoInicio().setCoordenadaY(0);
        getPontoFim().setCoordenadaX(fim);
        getPontoFim().setCoordenadaY(0);
    }
    
    @Override
    public double getArea(){
        return fim;
    }
    @Override
    public double getPerimetro(){
        return fim;
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
