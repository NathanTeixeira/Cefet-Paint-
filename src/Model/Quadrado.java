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

    public Quadrado(String id, int Lado) {
        setId(id);
        getId();
        getInferiorDireito().setCoordenadaX(Lado);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(Lado);
        getSuperiorDireito().setCoordenadaY(Lado);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Lado);
        this.setlado(Lado);
    }

    public void setLado(String id, int lado) {
        setId(id);
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

    @Override
    public String getCoordenadas() {
        return String.valueOf("TAMANHO: " + lado);
    }

    @Override
    public String getTipo() {
        return "QUADRADO";
    }
    
}
