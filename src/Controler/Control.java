package Controler;

import Model.FiguraGeometrica;
import Model.OpcoesMenu;
import Model.Ponto;
import Model.Ponto_Enum;
import Model.Quadrado;
import Model.Quadrado_Enum;
import Model.Retangulo;
import Model.Trapezio;
import Model.Triangulo;
import Model.Reta;
import Model.Reta_Enum;
import Model.Retangulo_Enum;
import Model.Trapezio_Enum;
import Model.Triangulo_Enum;
import View.Menu_View;
import View.Ponto_View;
import View.Quadrado_View;
import View.Reta_View;
import View.Retangulo_View;
import View.Trapezio_View;
import View.Triangulo_View;
import View.Viewer;

public class Control {

    private FiguraGeometrica[] figuras;
    private Viewer viewer;
    private Menu_View menuview;
    private Ponto_View pontoView;
    private Quadrado_View quadradoView;
    private Reta_View retaView;
    private Retangulo_View retanguloView;
    private Trapezio_View trapezioView;
    private Triangulo_View trianguloView;

    public Control() {
        figuras = new FiguraGeometrica[10];
        viewer = new Viewer();
        menuview = new Menu_View();
        quadradoView = new Quadrado_View();
        pontoView = new Ponto_View();
        retaView = new Reta_View();
        retanguloView = new Retangulo_View();
        trapezioView = new Trapezio_View();
        trianguloView = new Triangulo_View();

    }

    public void printMenu() {
        OpcoesMenu escolha = OpcoesMenu.LISTAR;
        Quadrado_Enum escolhaQuadrado = Quadrado_Enum.LISTAR_TIPOS;
        Retangulo_Enum escolhaRetangulo = Retangulo_Enum.LISTAR_TIPOS;
        Trapezio_Enum escolhaTrapezio = Trapezio_Enum.LISTAR_TIPOS;
        Triangulo_Enum escolhaTriangulo = Triangulo_Enum.LISTAR_TIPOS;
        Reta_Enum escolhaReta = Reta_Enum.LISTAR_TIPOS;
        Ponto_Enum escolhaPonto = Ponto_Enum.LISTAR_TIPOS;
        do {
            escolha = menuview.askOpcao();
            viewer.ShowMsg("################################# \n");
            viewer.ShowMsg("Você escolheu: " + escolha + "\n\n");
            switch (escolha) {
                case QUADRADO:
                    do {
                        escolhaQuadrado = quadradoView.menuQuadrado();
                        viewer.ShowMsg("Você escolheu: " + escolhaQuadrado + "\n\n");
                        switch (escolhaQuadrado) {
                            case NOVO:
                                Quadrado quadrado = quadradoView.askQuadrado();
                                inserirFiguras(quadrado, 0);
                                break;
                            case EDITAR:
                                break;
                            case LISTAR_TIPOS:
                                break;
                            case MOSTRAR:
                                break;
                            case EXCLUIR:
                                break;
                            case VOLTAR:
                                break;
                            default:
                        }
                    } while (escolhaQuadrado != Quadrado_Enum.VOLTAR);
                    break;
                case RETANGULO:
                    do {
                        escolhaRetangulo = retanguloView.menuRetangulo();
                        viewer.ShowMsg("Você escolheu: " + escolhaRetangulo + "\n\n");
                        switch (escolhaRetangulo) {
                            case NOVO:
                                Retangulo retangulo = retanguloView.askRetangulo();
                                inserirFiguras(retangulo, 1);
                                break;
                            case EDITAR:
                                break;
                            case LISTAR_TIPOS:
                                break;
                            case MOSTRAR:
                                break;
                            case EXCLUIR:
                                break;
                            case VOLTAR:
                                break;
                            default:
                        }
                    } while (escolhaRetangulo != Retangulo_Enum.VOLTAR);
                    break;
                case TRAPEZIO:
                    do {
                        escolhaTrapezio = trapezioView.menuTrapezio();
                        viewer.ShowMsg("Você escolheu: " + escolhaTrapezio + "\n\n");
                        switch (escolhaTrapezio) {
                            case NOVO:
                                Trapezio trapezio = trapezioView.askTrapezio();
                                inserirFiguras(trapezio, 2);
                                break;
                            case EDITAR:
                                break;
                            case LISTAR_TIPOS:
                                break;
                            case MOSTRAR:
                                break;
                            case EXCLUIR:
                                break;
                            case VOLTAR:
                                break;
                            default:
                        }
                    } while (escolhaTrapezio != Trapezio_Enum.VOLTAR);
                    break;
                case TRIANGULO:
                    do {
                        escolhaTriangulo = trianguloView.menuTriangulo();
                        viewer.ShowMsg("Você escolheu: " + escolhaTriangulo + "\n\n");
                        switch (escolhaTriangulo) {
                            case NOVO:
                                Triangulo triangulo = trianguloView.askTriangulo();
                                inserirFiguras(triangulo, 3);
                                break;
                            case EDITAR:
                                break;
                            case LISTAR_TIPOS:
                                break;
                            case MOSTRAR:
                                break;
                            case EXCLUIR:
                                break;
                            case VOLTAR:
                                break;
                            default:
                        }
                    } while (escolhaTriangulo != Triangulo_Enum.VOLTAR);
                    break;
                case RETA:
                    do {
                        escolhaReta = retaView.menuReta();
                        viewer.ShowMsg("Você escolheu: " + escolhaReta + "\n\n");
                        switch (escolhaReta) {
                            case NOVO:
                                Reta reta = retaView.askReta();
                                inserirFiguras(reta, 4);
                                break;
                            case EDITAR:
                                break;
                            case LISTAR_TIPOS:
                                break;
                            case MOSTRAR:
                                break;
                            case EXCLUIR:
                                break;
                            case VOLTAR:
                                break;
                            default:
                        }
                    } while (escolhaReta != Reta_Enum.VOLTAR);
                    break;
                case PONTO:
                    do {
                        escolhaPonto = pontoView.menuPonto();
                        viewer.ShowMsg("Você escolheu: " + escolhaPonto + "\n\n");
                        switch (escolhaPonto) {
                            case NOVO:
                                Ponto ponto = pontoView.askPonto();
                                inserirFiguras(ponto, 5);
                                break;
                            case EDITAR:
                                break;
                            case LISTAR_TIPOS:
                                break;
                            case MOSTRAR:
                                break;
                            case EXCLUIR:
                                break;
                            case VOLTAR:
                                break;
                            default:
                        }
                    } while (escolhaPonto != Ponto_Enum.VOLTAR);
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
                case SALVAR:
                    break;
                case RECARREGAR:
                    break;
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
                viewer.ShowMsg(figuras[i].getCoordenadas() + "\n");
                viewer.ShowMsg("**\n");
                viewer.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                viewer.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                viewer.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                viewer.ShowMsg("** \n");

            }
        }
    }

}
