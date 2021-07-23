package Model;

public class Retangulo extends Quadrilatero {

    private int base;
    private int Altura;

    public Retangulo() {
        this(2, 1);
    }

    public Retangulo(int base, int Altura) {
        getInferiorDireito().setCoordenadaX(base);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(base);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);

    }

    public void setLados(int base, int Altura) {
        getInferiorDireito().setCoordenadaX(base);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(base);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);
    }
    
    public double getArea(){
        return base*Altura;
    }
    
    public double getPerimetro(){
        return (base*2)+(Altura*2);
    }
    
    public double getDiagonal(){
        return Math.sqrt((base*base)+(Altura*Altura));
    }

}
