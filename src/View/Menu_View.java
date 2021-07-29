package View;

import Model.OpcoesMenu;

public class Menu_View {

    private Viewer basic;


    public Menu_View() {
        basic = new Viewer();
    }

    public OpcoesMenu askOpcao() {

        basic.ShowMsg("Digite uma opção \n"
                + "1 - Criar Quadrado\n"
                + "2 - Criar Retangulo\n"
                + "3 - Criar Trapézio\n"
                + "4 - Criar Triângulo\n"
                + "5 - Criar Reta\n"
                + "6 - Criar Ponto\n"
                + "7 - Apagar Item\n"
                + "8 - Listar\n"
                + "9 - Desenhar\n"
                + "0 - Sair \n");

        int opcao = basic.scn.nextInt();

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
