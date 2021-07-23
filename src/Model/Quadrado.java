package Model;

public class Quadrado extends Quadrilatero {

    private int lado;

    public Quadrado() {
        this(1);
    }

    public Quadrado(int lado) {
        getInferiorDireito().setCoordenadaX(lado);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(lado);
        getSuperiorDireito().setCoordenadaY(lado);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(lado);
    }

    public void setLado(int lado) {
        getInferiorDireito().setCoordenadaX(lado);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(lado);
        getSuperiorDireito().setCoordenadaY(lado);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(lado);
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }
    
    @Override
    public double getDiagonal(){
        return Math.sqrt(((lado*lado)*2));
    }
}
