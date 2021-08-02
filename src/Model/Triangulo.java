package Model;

public class Triangulo extends FiguraGeometrica {

    private Ponto inferiorEsquerdo;
    private Ponto inferiorDireito;
    private Ponto superior;
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

    public Triangulo() {
        this("TRIANGULO", 4, 3);
    }

    public Triangulo(String id, int base, int altura) {
        setId(id);
        inferiorEsquerdo = new Ponto(null,0, 0);
        inferiorDireito = new Ponto(null,base, 0);
        superior = new Ponto(null, base / 2, altura);
        this.setBase(base);
        this.setAltura(altura);
    }

    public void setLados(String id, int base, int altura) {
        setId(id);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getInferiorDireito().setCoordenadaX(base);
        getInferiorDireito().setCoordenadaY(0);
        getSuperior().setCoordenadaX(base / 2);
        getSuperior().setCoordenadaY(altura);
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return base + (Math.sqrt((base / 2) * (base / 2) + (altura * altura)) * 2);
    }

    @Override
    public String getCoordenadas() {
        return String.valueOf("BASE: " + base + " - ALTURA: " + altura);
    }

    @Override
    public String getTipo() {
        return "TRIÂNGULO";
    }

    public Ponto getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    public void setInferiorEsquerdo(Ponto inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Ponto getInferiorDireito() {
        return inferiorDireito;
    }

    public void setInferiorDireito(Ponto inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Ponto getSuperior() {
        return superior;
    }

    public void setSuperior(Ponto superior) {
        this.superior = superior;
    }

}
