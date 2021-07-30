package Controler;

import Model.FiguraGeometrica;
import Model.OpcoesMenu;
import Model.Ponto;
import Model.Quadrado;
import Model.Retangulo;
import Model.Trapezio;
import Model.Triangulo;
import Model.Reta;
import View.Menu_View;
import View.Model_View;
import View.Viewer;
import java.text.DecimalFormat;

public class Control {

    private FiguraGeometrica[] figuras;
    private Viewer viewer;
    private Model_View modelview;
    private Menu_View menuview;

    public Control() {
        figuras = new FiguraGeometrica[10];
        viewer = new Viewer();
        modelview = new Model_View();
        menuview = new Menu_View();
    }

    public void printMenu() {
        OpcoesMenu escolha = OpcoesMenu.LISTAR;

        do {
            escolha = menuview.askOpcao();
            viewer.ShowMsg("################################# \n");
            viewer.ShowMsg("Você escolheu: " + escolha + "\n\n");
            switch (escolha) {
                case QUADRADO:
                    Quadrado quadrado = modelview.askQuadrado();
                    inserirFiguras(quadrado, 0);
                    break;
                case RETANGULO:
                    Retangulo retangulo = modelview.askRetangulo();
                    inserirFiguras(retangulo, 1);
                    break;
                case TRAPEZIO:
                    Trapezio trapezio = modelview.askTrapezio();
                    inserirFiguras(trapezio, 2);
                    break;
                case TRIANGULO:
                    Triangulo triangulo = modelview.askTriangulo();
                    inserirFiguras(triangulo, 3);
                    break;
                case RETA:
                    Reta reta = modelview.askReta();
                    inserirFiguras(reta, 4);
                    break;
                case PONTO:
                    Ponto ponto = modelview.askPonto();
                    inserirFiguras(ponto, 5);
                    break;
                case APAGAR:
                    viewer.ShowMsg("########################## \n\n");
                    lerFiguras();
                    if (apagarFiguras() == true) {
                        viewer.ShowMsg("SUCESSO AO APAGAR! \n");
                        viewer.ShowMsg("########################## \n\n");
                        break;
                    } else {
                        viewer.ShowMsg("FALHA AO APAGAR! \n");
                        viewer.ShowMsg("########################## \n\n");
                        break;
                    }
                case LISTAR:
                    lerFiguras();
                    viewer.ShowMsg("###################### \n\n");
                    break;
                case DESENHAR:
                    viewer.ShowMsg("coming soon");
                    break;
                case SAIR:
                    viewer.ShowMsg("ADIOS!!!");
                    break;
                default:

            }

        } while (escolha != OpcoesMenu.SAIR);
    }

    public boolean inserirFiguras(FiguraGeometrica f, int i) {
        figuras[i] = f;
        viewer.ShowMsg("################################## \n\n");
        for (int j = 0; j < figuras.length; j++) {
            if (figuras == null) {
                figuras[j] = f;
                viewer.ShowMsg("########################## \n\n");
                return true;
            }
        }
        return false;
    }

    public boolean apagarFiguras() {
        menuview.askApagar();
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                if (menuview.getId().equals(figuras[i].getId())) {
                    figuras[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public void lerFiguras() {
        viewer.ShowMsg("**LISTA** \n");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                viewer.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                viewer.ShowMsg("ID: " + figuras[i].getId() + "\n");
                viewer.ShowMsg("**\n");
                viewer.ShowMsg(figuras[i].getCoordenadas()+"\n");
                viewer.ShowMsg("**\n");
                viewer.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                viewer.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                viewer.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                viewer.ShowMsg("** \n");

            }
        }
    }

}
