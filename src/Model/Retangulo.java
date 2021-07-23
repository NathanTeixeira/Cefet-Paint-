package Model;

public class Retangulo extends Quadrilatero {

    private int base;
    private int altura;

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
    
    
    @Override
    public double getArea(){
        return base*altura;
    }
    
    @Override
    public double getPerimetro(){
        return (base*2)+(altura*2);
    }
    
    @Override
    public double getDiagonal(){
        return Math.sqrt((base*base)+(altura*altura));
    }

}
