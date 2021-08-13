package Controler;

import DAO.dao;
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
import View.basicView;

public class Control {

    private FiguraGeometrica[] figuras;
    private basicView basic;
    private Menu_View menuview;
    private Ponto_View pontoView;
    private Reta_View retaView;
    private Retangulo_View retanguloView;
    private Trapezio_View trapezioView;
    private Triangulo_View trianguloView;
    private OpcoesMenu escolha;
    private Quadrado_View quadradoView;
    private dao persistencia;

    public FiguraGeometrica[] getFiguras() {
        return figuras;
    }

    public void setFiguras(FiguraGeometrica[] figuras) {
        this.figuras = figuras;
    }

    public Control() {
        figuras = new FiguraGeometrica[10];
        basic = new basicView();
        menuview = new Menu_View();
        quadradoView = new Quadrado_View();
        pontoView = new Ponto_View();
        retaView = new Reta_View();
        retanguloView = new Retangulo_View();
        trapezioView = new Trapezio_View();
        trianguloView = new Triangulo_View();
        persistencia = new dao();
    }

    public void printMenu() {
        escolha = OpcoesMenu.LISTAR;
        Quadrado_Enum escolhaQuadrado = Quadrado_Enum.LISTAR_TIPOS;
        Retangulo_Enum escolhaRetangulo = Retangulo_Enum.LISTAR_TIPOS;
        Trapezio_Enum escolhaTrapezio = Trapezio_Enum.LISTAR_TIPOS;
        Triangulo_Enum escolhaTriangulo = Triangulo_Enum.LISTAR_TIPOS;
        Reta_Enum escolhaReta = Reta_Enum.LISTAR_TIPOS;
        Ponto_Enum escolhaPonto = Ponto_Enum.LISTAR_TIPOS;
        do {
            escolha = menuview.askOpcao();
            basic.ShowMsg("################################# \n");
            basic.ShowMsg("Você escolheu: " + escolha + "\n\n");
            switch (escolha) {
                case QUADRADO:
                    do {
                        escolhaQuadrado = quadradoView.menuQuadrado();
                        basic.ShowMsg("Você escolheu: " + escolhaQuadrado + "\n\n");
                        switch (escolhaQuadrado) {
                            case NOVO:
                                Quadrado quadrado = quadradoView.askQuadrado();
                                inserirFiguras(quadrado);
                                break;
                            case EDITAR:
                                if (editarFiguras() == true) {
                                    quadradoView.editarQuadrado();
                                } else {
                                    basic.ShowMsg("FALHA AO EDITAR\n");
                                }
                                break;
                            case LISTAR_TIPOS:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("QUADRADO")) {
                                            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                                            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                                            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                                            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                                            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                                            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                                            basic.ShowMsg("** \n");

                                        }
                                    }
                                }
                                break;
                            case MOSTRAR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("QUADRADO")) {
                                            mostrarFigura(i);
                                        }
                                    }
                                }
                                break;
                            case EXCLUIR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("QUADRADO")) {
                                            apagarId(i);
                                        }
                                    }
                                }
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
                        basic.ShowMsg("Você escolheu: " + escolhaRetangulo + "\n\n");
                        switch (escolhaRetangulo) {
                            case NOVO:
                                Retangulo retangulo = retanguloView.askRetangulo();
                                inserirFiguras(retangulo);
                                break;
                            case EDITAR:
                                if (editarFiguras() == true) {
                                    retanguloView.editarRetangulo();
                                } else {
                                    basic.ShowMsg("FALHA AO EDITAR\n");
                                }
                                break;
                            case LISTAR_TIPOS:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("RETANGULO")) {
                                            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                                            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                                            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                                            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                                            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                                            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                                            basic.ShowMsg("** \n");

                                        }
                                    }
                                }
                                break;
                            case MOSTRAR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("RETANGULO")) {
                                            mostrarFigura(i);
                                        }
                                    }
                                }
                                break;
                            case EXCLUIR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("RETANGULO")) {
                                            apagarId(i);
                                        }
                                    }
                                }
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
                        basic.ShowMsg("Você escolheu: " + escolhaTrapezio + "\n\n");
                        switch (escolhaTrapezio) {
                            case NOVO:
                                Trapezio trapezio = trapezioView.askTrapezio();
                                inserirFiguras(trapezio);
                                break;
                            case EDITAR:
                                if (editarFiguras() == true) {
                                    trapezioView.editarTrapezio();
                                } else {
                                    basic.ShowMsg("FALHA AO EDITAR\n");
                                }
                                break;
                            case LISTAR_TIPOS:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("TRAPEZIO")) {
                                            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                                            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                                            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                                            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                                            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                                            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                                            basic.ShowMsg("** \n");

                                        }
                                    }
                                }
                                break;
                            case MOSTRAR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("TRAPEZIO")) {
                                            mostrarFigura(i);
                                        }
                                    }
                                }
                                break;
                            case EXCLUIR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("TRAPEZIO")) {
                                            apagarId(i);
                                        }
                                    }
                                }
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
                        basic.ShowMsg("Você escolheu: " + escolhaTriangulo + "\n\n");
                        switch (escolhaTriangulo) {
                            case NOVO:
                                Triangulo triangulo = trianguloView.askTriangulo();
                                inserirFiguras(triangulo);
                                break;
                            case EDITAR:
                                if (editarFiguras() == true) {
                                    trianguloView.editarTriangulo();
                                } else {
                                    basic.ShowMsg("FALHA AO EDITAR\n");
                                }
                                break;
                            case LISTAR_TIPOS:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("TRIANGULO")) {
                                            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                                            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                                            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                                            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                                            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                                            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                                            basic.ShowMsg("** \n");

                                        }
                                    }
                                }
                                break;
                            case MOSTRAR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("TRIANGULO")) {
                                            mostrarFigura(i);
                                        }
                                    }
                                }
                                break;
                            case EXCLUIR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("TRIANGULO")) {
                                            apagarId(i);
                                        }
                                    }
                                }
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
                        basic.ShowMsg("Você escolheu: " + escolhaReta + "\n\n");
                        switch (escolhaReta) {
                            case NOVO:
                                Reta reta = retaView.askReta();
                                inserirFiguras(reta);
                                break;
                            case EDITAR:
                                if (editarFiguras() == true) {
                                    retaView.editarReta();
                                } else {
                                    basic.ShowMsg("FALHA AO EDITAR\n");
                                }
                                break;
                            case LISTAR_TIPOS:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("RETA")) {
                                            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                                            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                                            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                                            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                                            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                                            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                                            basic.ShowMsg("** \n");

                                        }
                                    }
                                }
                                break;
                            case MOSTRAR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("RETA")) {
                                            mostrarFigura(i);
                                        }
                                    }
                                }
                                break;
                            case EXCLUIR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("RETA")) {
                                            apagarId(i);
                                        }
                                    }
                                }
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
                        basic.ShowMsg("Você escolheu: " + escolhaPonto + "\n\n");
                        switch (escolhaPonto) {
                            case NOVO:
                                Ponto ponto = pontoView.askPonto();
                                inserirFiguras(ponto);
                                break;
                            case EDITAR:
                                if (editarFiguras() == true) {
                                    pontoView.editarPonto();
                                } else {
                                    basic.ShowMsg("FALHA AO EDITAR\n");
                                }
                                break;
                            case LISTAR_TIPOS:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("PONTO")) {
                                            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                                            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                                            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                                            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                                            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                                            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                                            basic.ShowMsg("** \n");

                                        }
                                    }
                                }
                                break;
                            case MOSTRAR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("PONTO")) {
                                            mostrarFigura(i);
                                        }
                                    }
                                }
                                break;
                            case EXCLUIR:
                                for (int i = 0; i < figuras.length; i++) {
                                    if (figuras[i] != null) {
                                        if (figuras[i].getTipo().equals("PONTO")) {
                                            apagarId(i);
                                        }
                                    }
                                }
                                break;
                            case VOLTAR:
                                break;
                            default:
                        }
                    } while (escolhaPonto != Ponto_Enum.VOLTAR);
                    break;
                case APAGAR:
                    basic.ShowMsg("########################## \n\n");
                    lerFiguras();
                    if (apagarFiguras() == true) {
                        basic.ShowMsg("SUCESSO AO APAGAR! \n");
                        basic.ShowMsg("########################## \n\n");
                        break;
                    } else {
                        basic.ShowMsg("FALHA AO APAGAR! \n");
                        basic.ShowMsg("########################## \n\n");
                        break;
                    }
                case SALVAR:
                    persistencia.salvar(figuras);
                    break;
                case RECARREGAR:
                    figuras = persistencia.carregar();
                    break;
                case LISTAR:
                    lerFiguras();
                    basic.ShowMsg("###################### \n\n");
                    break;
                case DESENHAR:
                    basic.ShowMsg("coming soon");
                    break;
                case SAIR:
                    basic.ShowMsg("ADIOS!!!");
                    break;
                default:
            }

        } while (escolha != OpcoesMenu.SAIR);
    }

    public boolean inserirFiguras(FiguraGeometrica f) {
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null) {
                figuras[i] = f;
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

    public boolean editarFiguras() {
        menuview.askEditar();
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                if (menuview.getId().equals(figuras[i].getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void lerFiguras() {
        basic.ShowMsg("**LISTA** \n");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                basic.ShowMsg("** \n");
            }
        }
    }

    public boolean mostrarFigura(int i) {
        menuview.askMostrar();
        if (menuview.getId().equals(figuras[i].getId())) {
            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
            basic.ShowMsg("** \n");
            return true;
        }
        return false;
    }

    public boolean apagarId(int i) {
        menuview.askApagarId();
        if (menuview.getId().equals(figuras[i].getId())) {
            figuras[i] = null;
            basic.ShowMsg("OPERAÇÃO BEM SUCEDIDA\n\n");
            return true;
        }
        return false;
    }

}
