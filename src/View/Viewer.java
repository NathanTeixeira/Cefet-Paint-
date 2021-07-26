package View;

import Model.OpcoesMenu;
import Model.Ponto;
import Model.Quadrado;
import Model.Reta;
import Model.Retangulo;
import Model.Trapezio;
import Model.Triangulo;
import java.util.Scanner;

public class Viewer {

    protected Scanner scn;

    public Viewer() {
        scn = new Scanner(System.in);
    }

    public void ShowMsg(String msg) {
        System.out.print(msg);
    }

    public int AskInt() {
        return scn.nextInt();
    }

    public Quadrado askQuadrado() {
        ShowMsg("DIGITE O TAMANHO DO LADO DO QUADRADO: ");
        int tam = scn.nextInt();
        Quadrado quadrado = new Quadrado(tam);
        return quadrado;
    }

    public Retangulo askRetangulo() {
        ShowMsg("DIGITE O VALOR DA BASE E DA ALTURA DO RETÂNGULO: ");
        int base = scn.nextInt();
        int altura = scn.nextInt();
        Retangulo retangulo = new Retangulo(base, altura);
        return retangulo;
    }

    public Trapezio askTrapezio() {
        ShowMsg("DIGITE O VALOR DAS BASES E DA ALTURA DO TRAPEZIO :");
        int baseInf = scn.nextInt();
        int baseSup = scn.nextInt();
        int altura = scn.nextInt();
        Trapezio trapezio = new Trapezio(baseInf, baseSup, altura);
        return trapezio;
    }

    public Triangulo askTriangulo() {
        ShowMsg("DIGITE O VALOR DA BASE E DA ALTURA DO TRIÂNGULO: ");
        int base = scn.nextInt();
        int altura = scn.nextInt();
        Triangulo triangulo = new Triangulo(base, altura);
        return triangulo;
    }

    public Reta askReta() {
        ShowMsg("DIGITE O TAMANHO DA RETA: ");
        int tam = scn.nextInt();
        Reta reta = new Reta(tam);
        return reta;
    }

    public Ponto askPonto() {
        ShowMsg("DIGITE AS COORDENADAS DO PONTO: ");
        int X = scn.nextInt();
        int Y = scn.nextInt();
        Ponto ponto = new Ponto(X, Y);
        return ponto;
    }

    public OpcoesMenu askOpcao() {

        ShowMsg("Digite uma opção \n"
                + "1 - Criar Quadrado\n"
                + "2 - Criar Retangulo\n"
                + "3 - Criar Trapézio\n"
                + "4 - Criar Triângulo\n"
                + "5 - Criar Reta\n"
                + "6 - Criar Ponto\n"
                + "7 - Apagar Item\n"
                + "8 - Listar\n"
                + "9 - Desenhar\n"
                + "0 - Sair");

        int opcao = scn.nextInt();

        switch (opcao) {
            case 1:
                return OpcoesMenu.QUADRADO;
            case 2:
                return OpcoesMenu.RETANGULO;
            case 3:
                return OpcoesMenu.TRAPEZIO;
            case 4:
                return OpcoesMenu.TRIANGULO;
            case 5:
                return OpcoesMenu.RETA;
            case 6:
                return OpcoesMenu.PONTO;
            case 7:
                return OpcoesMenu.APAGAR;
            case 8:
                return OpcoesMenu.LISTAR;
            case 9:
                return OpcoesMenu.DESENHAR;
            default:
                return OpcoesMenu.SAIR;
        }
    }

}
