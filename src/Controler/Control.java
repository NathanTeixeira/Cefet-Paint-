package Controler;

import Model.FiguraGeometrica;
import Model.OpcoesMenu;
import Model.Ponto;
import Model.Quadrado;
import Model.Retangulo;
import Model.Trapezio;
import Model.Triangulo;
import Model.Reta;
import View.Viewer;

public class Control {

    private FiguraGeometrica[] figuras;
    private Viewer viewer;

    public Control() {
        figuras = new FiguraGeometrica[10];
        viewer = new Viewer();

    }

    public void printMenu() {
        OpcoesMenu escolha = OpcoesMenu.LISTAR;

        do {
            escolha = viewer.askOpcao();
            viewer.ShowMsg("Você escolheu: " + escolha+"\n");
            switch (escolha) {
                case QUADRADO:
                    Quadrado quadrado = viewer.askQuadrado();
                    inserirFiguras(quadrado, 0);
                    break;
                case RETANGULO:
                    Retangulo retangulo = viewer.askRetangulo();
                    inserirFiguras(retangulo, 1);
                    break;
                case TRAPEZIO:
                    Trapezio trapezio = viewer.askTrapezio();
                    inserirFiguras(trapezio, 2);
                    break;
                case TRIANGULO:
                    Triangulo triangulo = viewer.askTriangulo();
                    inserirFiguras(triangulo, 3);
                    break;
                case RETA:
                    Reta reta = viewer.askReta();
                    inserirFiguras(reta, 4);
                    break;
                case PONTO:
                    Ponto ponto = viewer.askPonto();
                   inserirFiguras(ponto, 5);
                    break;
                case LISTAR:
                    for (int i = 0; i < figuras.length; i++) {
                        if (figuras[i] != null) {
                            viewer.ShowMsg(figuras[i].toString()+"\n");
                        }
                    }
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
    
    public boolean inserirFiguras(FiguraGeometrica f, int i){
        figuras[i] = f;
        for (int j = 0; j < figuras.length; j++) {
            if(figuras == null){
                figuras[j] = f;
                return true;              
            }          
        }      
       return false; 
    }
    
    /* public boolean apagarFiguras(){
    for (int i = 0; i < figuras.length; i++) {
    if(viewer.askApagar().equals(viewer))
    
    }
    return false;
    }*/
    
    

}
