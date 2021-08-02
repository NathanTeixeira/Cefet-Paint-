package Model;

public class Retangulo extends Quadrilatero {

    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Retangulo() {
        this("RETANGULO", 2, 1);
    }

    public Retangulo(String id, int base, int Altura) {
        setId(id);
        getInferiorDireito().setCoordenadaX(base);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(base);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);
        this.setBase(base);
        this.setAltura(Altura);
    }

    public void setLados(String id, int base, int Altura) {
        setId(id);
        getInferiorDireito().setCoordenadaX(base);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(base);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return (base * 2) + (altura * 2);
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    @Override
    public String getCoordenadas() {
        return String.valueOf("BASE: " + base + " - ALTURA: " + altura);
    }

    @Override
    public String getTipo() {
        return "RETANGULO";
    }

}
