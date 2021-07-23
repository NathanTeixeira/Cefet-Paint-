package Model;

public class Quadrado extends Quadrilatero {

    private int Lado;

    public Quadrado() {
        this(1);
    }

    public Quadrado(int Lado) {
        getInferiorDireito().setCoordenadaX(Lado);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(Lado);
        getSuperiorDireito().setCoordenadaY(Lado);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Lado);
    }

    public void setLado(int Lado) {
        getInferiorDireito().setCoordenadaX(Lado);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(Lado);
        getSuperiorDireito().setCoordenadaY(Lado);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Lado);
    }

    public double getArea() {
        return Lado * Lado;
    }

    public double getPerimetro() {
        return Lado * 4;
    }
    
    public double getDiagonal(){
        return Math.sqrt(((Lado*Lado)*2));
    }
}
