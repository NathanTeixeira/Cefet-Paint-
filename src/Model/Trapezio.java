package Model;

public class Trapezio extends Quadrilatero {

    private int baseInferior;
    private int baseSuperior;
    private int altura;

    public int getBaseInferior() {
        return baseInferior;
    }

    public void setBaseInferior(int baseInferior) {
        this.baseInferior = baseInferior;
    }

    public int getBaseSuperior() {
        return baseSuperior;
    }

    public void setBaseSuperior(int baseSuperior) {
        this.baseSuperior = baseSuperior;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Trapezio() {
        this("TRAPEZIO", 3, 2, 4);
    }

    public Trapezio(String id, int baseInferior, int baseSuperior, int Altura) {
        setId(id);
        getInferiorDireito().setCoordenadaX(baseInferior);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(baseSuperior);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);
        this.setBaseInferior(baseInferior);
        this.setBaseSuperior(baseSuperior);
        this.setAltura(Altura);
    }

    public void setLados(String id, int baseInferior, int baseSuperior, int Altura) {
        setId(id);
        getInferiorDireito().setCoordenadaX(baseInferior);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(baseSuperior);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);
    }

    @Override
    public double getArea() {
        return ((baseInferior + baseSuperior) * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return baseInferior + baseSuperior + (altura * 2);
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt((baseInferior * baseInferior) + (altura * altura));
    }

    @Override
    public String getCoordenadas() {
        return String.valueOf("BASE INFERIOR: " + baseInferior + " - BASE SUPERIOR: " + baseSuperior + " - ALTURA: " + altura);
    }

    @Override
    public String getTipo() {
        return "TRAPÉZIO";
    }

}
