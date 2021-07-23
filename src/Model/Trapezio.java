package Model;

public class Trapezio extends Quadrilatero {

    private int baseInferior ;
    private int baseSuperior ;
    private int altura;

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

    @Override
    public double getArea() {
        return ((baseInferior + baseSuperior) * altura) / 2;
    }
    
    @Override
    public double getPerimetro(){
        return baseInferior + baseSuperior + (altura*2);
    }
    
    @Override
    public double getDiagonal(){
        return Math.sqrt((baseInferior*baseInferior)+(altura*altura));
    }

}
