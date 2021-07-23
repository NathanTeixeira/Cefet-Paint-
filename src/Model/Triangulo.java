package Model;

public class Triangulo extends FiguraGeometrica {

    private Ponto inferiorEsquerdo;
    private Ponto inferiorDireito;
    private Ponto superior;
    private int base;
    private int altura;

    public Triangulo() {
        this(4, 3);
    }

    public Triangulo(int base, int altura) {
        inferiorEsquerdo = new Ponto(0, 0);
        inferiorDireito = new Ponto(base, 0);
        superior = new Ponto(base / 2, altura);
    }

    public void setLados(int base, int altura) {
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getInferiorDireito().setCoordenadaX(base);
        getInferiorDireito().setCoordenadaY(0);
        getSuperior().setCoordenadaX(base/2);
        getSuperior().setCoordenadaY(altura);
    }
    
    @Override
    public double getArea(){
        return (base*altura)/2;
    }
    
    @Override
    public double getPerimetro(){
        return base + (Math.sqrt((base/2)*(base/2)+(altura*altura))*2);
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
