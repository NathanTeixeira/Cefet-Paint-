package View;

import Model.Ponto;
import Model.Quadrado;
import Model.Reta;
import Model.Retangulo;
import Model.Trapezio;
import Model.Triangulo;

public class Model_View {

    private Viewer basic;

    public Model_View() {
        basic = new Viewer();
    }

    public Quadrado askQuadrado() {
        //Quadrado quadrado = new Quadrado();
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O TAMANHO DO LADO DO QUADRADO: ");
        int lado = basic.scn.nextInt();
        Quadrado quadrado;
        quadrado = new Quadrado(id, lado);
        return quadrado;
    }

    public Retangulo askRetangulo() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DA BASE: ");
        int base = basic.scn.nextInt();
        basic.ShowMsg("DIIGITE O VALOR DA ALTURA: ");
        int altura = basic.scn.nextInt();
        basic.ShowMsg("\n");
        Retangulo retangulo;
        retangulo = new Retangulo(id, base, altura);
        return retangulo;
    }

    public Trapezio askTrapezio() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DA BASE INFERIOR:");
        int baseInferior = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DA BASE SUPERIOR: ");
        int baseSuperior = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DA ALTURA: ");
        int altura = basic.scn.nextInt();
        basic.ShowMsg("\n");
        Trapezio trapezio;
        trapezio = new Trapezio(id, baseInferior, baseSuperior, altura);
        return trapezio;
    }

    public Triangulo askTriangulo() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DA BASE: ");
        int base = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DA ALTURA: ");
        int altura = basic.scn.nextInt();
        basic.ShowMsg("\n");
        Triangulo triangulo;
        triangulo = new Triangulo(id, base, altura);
        return triangulo;
    }

    public Reta askReta() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O TAMANHO DA RETA: ");
        int fim = basic.scn.nextInt();
        basic.ShowMsg("\n");
        Reta reta;
        reta = new Reta(id, fim);
        return reta;
    }

    public Ponto askPonto() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DE X: ");
        int coordenadaX = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DE Y: ");
        int coordenadaY = basic.scn.nextInt();
        basic.ShowMsg("\n");
        Ponto ponto;
        ponto = new Ponto(id, coordenadaX, coordenadaY );
        return ponto;
    }
}
