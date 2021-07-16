package Model;

public abstract class Quadrilatero extends FiguraGeometrica {
    
    private Ponto origem;
    private Ponto inferiorDireito;
    private Ponto inferiorEsquerdo;
    private Ponto superiorDireito;
    private Ponto superiorEsquerdo;

    public double getDiagonal() {
        return 0;
    }

    public Quadrilatero() {
        this.origem = new Ponto(0,0);
        this.inferiorDireito = new Ponto(1,0);
        this.inferiorEsquerdo = new Ponto(0,0);
        this.superiorDireito = new Ponto(1,1);
        this.superiorEsquerdo = new Ponto(0,1);
    }

    public Ponto getOrigem() {
        return origem;
    }

    protected void setOrigem(Ponto origem) {
        this.origem = origem;
    }

    public Ponto getInferiorDireito() {
        return inferiorDireito;
    }

    protected void setInferiorDireito(Ponto inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Ponto getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    protected void setInferiorEsquerdo(Ponto inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Ponto getSuperiorDireito() {
        return superiorDireito;
    }

    protected void setSuperiorDireito(Ponto superiorDireito) {
        this.superiorDireito = superiorDireito;
    }

    public Ponto getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    protected void setSuperiorEsquerdo(Ponto superiorEsquerdo) {
        this.superiorEsquerdo = superiorEsquerdo;
    }
    
    
    

    

}
