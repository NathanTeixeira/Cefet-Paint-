package Model;

public class Quadrado extends Quadrilatero {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setlado(int lado) {
        this.lado = lado;
    }

    public Quadrado() {
        this("QUADRADO", 1);
    }

    public Quadrado(String id, int lado) {
        setId("QUADRADO");
        getId();
        getInferiorDireito().setCoordenadaX(lado);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(lado);
        getSuperiorDireito().setCoordenadaY(lado);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(lado);
        this.setlado(1);
    }

    public void setLado(String id, int lado) {
        setId("QUADRADO");
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
        return getLado() * getLado();
    }

    @Override
    public double getPerimetro() {
        return getLado() * 4;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(((lado * lado) * 2));
    }
}
