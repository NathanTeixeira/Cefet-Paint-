package View;

import Model.Ponto;
import Model.Quadrado;
import Model.Reta;
import Model.Retangulo;
import Model.Trapezio;
import Model.Triangulo;

public class Model_View {
    
    private Viewer basic;
    
    public Model_View(){
        basic = new Viewer();
    }

    public Quadrado askQuadrado() {
        Quadrado quadrado = new Quadrado();
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        quadrado.setId(basic.scn.next());
        basic.ShowMsg("DIGITE O TAMANHO DO LADO DO QUADRADO: ");
        quadrado.setlado(basic.scn.nextInt());
        quadrado.setLado(quadrado.getId(), quadrado.getLado());
        return quadrado;
    }

    public Retangulo askRetangulo() {
        Retangulo retangulo = new Retangulo();
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        retangulo.setId(basic.scn.next());
        basic.ShowMsg("DIGITE O VALOR DA BASE: ");
        retangulo.setBase(basic.scn.nextInt());
        basic.ShowMsg("DIIGITE O VALOR DA ALTURA: ");
        retangulo.setAltura(basic.scn.nextInt());
        retangulo.setLados(retangulo.getId(), retangulo.getBase(), retangulo.getAltura());
        return retangulo;
    }

    public Trapezio askTrapezio() {
        Trapezio trapezio = new Trapezio();
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        trapezio.setId(basic.scn.next());
        basic.ShowMsg("DIGITE O VALOR DA BASE INFERIOR:");
        trapezio.setBaseInferior(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O VALOR DA BASE SUPERIOR: ");
        trapezio.setBaseSuperior(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O VALOR DA ALTURA: ");
        trapezio.setAltura(basic.scn.nextInt());
        trapezio.setLados(trapezio.getId(), trapezio.getBaseInferior(), trapezio.getBaseSuperior(), trapezio.getAltura());
        return trapezio;
    }

    public Triangulo askTriangulo() {
        Triangulo triangulo = new Triangulo();
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        triangulo.setId(basic.scn.next());
        basic.ShowMsg("DIGITE O VALOR DA BASE: ");
        triangulo.setBase(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O VALOR DA ALTURA: ");
        triangulo.setAltura(basic.scn.nextInt());
        triangulo.setLados(triangulo.getId(), triangulo.getBase(), triangulo.getAltura());
        return triangulo;
    }

    public Reta askReta() {
        Reta reta = new Reta();
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        reta.setId(basic.scn.next());
        basic.ShowMsg("DIGITE O TAMANHO DA RETA: ");
        reta.setFim(basic.scn.nextInt());
        reta.setLado(reta.getId(), reta.getFim());
        return reta;
    }

    public Ponto askPonto() {
        Ponto ponto = new Ponto();
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        ponto.setId(basic.scn.next());
        basic.ShowMsg("DIGITE O VALOR DE X: ");
        ponto.setCoordenadaX(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O VALOR DE Y: ");
        ponto.setCoordenadaY(basic.scn.nextInt());
        ponto.setPonto(ponto.getId(), ponto.getCoordenadaX(), ponto.getCoordenadaY());
        return ponto;
    }
}
