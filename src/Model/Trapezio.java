package Model;

public class Trapezio extends Quadrilatero {

    private int baseInferior ;
    private int baseSuperior ;
    private int Altura;

    public Trapezio() {
        this(3, 2, 4);
    }

    public Trapezio(int baseInferior, int baseSuperior, int Altura) {
        getInferiorDireito().setCoordenadaX(baseInferior);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(baseSuperior);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);
    }

    public void setLados(int baseInferior, int baseSuperior, int Altura) {
        getInferiorDireito().setCoordenadaX(baseInferior);
        getInferiorDireito().setCoordenadaY(0);
        getInferiorEsquerdo().setCoordenadaX(0);
        getInferiorEsquerdo().setCoordenadaY(0);
        getSuperiorDireito().setCoordenadaX(baseSuperior);
        getSuperiorDireito().setCoordenadaY(Altura);
        getSuperiorEsquerdo().setCoordenadaX(0);
        getSuperiorEsquerdo().setCoordenadaY(Altura);
    }

    public double getArea() {
        return ((baseInferior + baseSuperior) * Altura) / 2;
    }
    
    public double getPerimetro(){
        return baseInferior + baseSuperior + (Altura*2);
    }
    
    public double getDiagonal(){
        return Math.sqrt((baseInferior*baseInferior)+(Altura*Altura));
    }

}
