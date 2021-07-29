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
            viewer.ShowMsg("$$$$$$$$$$$$$$$$$$$$$$$$$$ \n");
            viewer.ShowMsg("Você escolheu: " + escolha + "\n");
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
                    viewer.ShowMsg("########################## \n");
                    if(apagarFiguras() == true){
                        viewer.ShowMsg("SUCESSO AO APAGAR! \n");
                        viewer.ShowMsg("########################## \n");
                        break;
                    }else{
                        viewer.ShowMsg("FALHA AO APAGAR! \n");
                        viewer.ShowMsg("########################## \n");
                        break;
                    }
                case LISTAR:
                    viewer.ShowMsg("**************** \n");
                    lerFiguras();
                    viewer.ShowMsg("**************** \n");
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
        viewer.ShowMsg("$$$$$$$$$$$$$$$$$$$$$$$$$$ \n");
        for (int j = 0; j < figuras.length; j++) {
            if (figuras == null) {
                figuras[j] = f;
                viewer.ShowMsg("$$$$$$$$$$$$$$$$$$$$$$$$$$ \n");
                return true;
            }
        }
        return false;
    }

    public boolean apagarFiguras() {
        viewer.ShowMsg("DIGITE O ID DA FIGURA QUE DESEJA APAGAR: ");
        String id = viewer.AskString();
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                if (id.equals(figuras[i].getId())) {
                    figuras[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public void lerFiguras() {
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                viewer.ShowMsg("ID: "+figuras[i].getId()+"\n");
                //viewer.ShowMsg("Lados: "+));
                viewer.ShowMsg("AREA: "+figuras[i].getArea()+"\n");
                viewer.ShowMsg("PERIMETRO: "+figuras[i].getPerimetro()+"\n");
                viewer.ShowMsg("DIAGONAL: "+figuras[i].getDiagonal()+"\n");
            }
        }
    }

}
