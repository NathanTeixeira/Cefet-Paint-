package View;

import Model.OpcoesMenu;

public class Menu_View {

    private Viewer basic;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Menu_View() {
        basic = new Viewer();
    }

    public OpcoesMenu askOpcao() {

        basic.ShowMsg("Digite uma opção \n"
                + "1 - Texto\n"
                + "2 - Criar Quadrado\n"
                + "3 - Criar Retangulo\n"
                + "4 - Criar Trapézio\n"
                + "5 - Criar Triângulo\n"
                + "6 - Criar Reta\n"
                + "7 - Criar Ponto\n"
                + "8 - Apagar Item\n"
                + "9 - Salvar\n"
                + "10 - Recarregar\n"
                + "11 - Listar\n"
                + "12 - Desenhar\n"
                + "0 - Sair \n");

        int opcao = basic.scn.nextInt();

        switch (opcao) {
            case 1:
                return OpcoesMenu.TEXTO;
            case 2:
                return OpcoesMenu.QUADRADO;
            case 3:
                return OpcoesMenu.RETANGULO;
            case 4:
                return OpcoesMenu.TRAPEZIO;
            case 5:
                return OpcoesMenu.TRIANGULO;
            case 6:
                return OpcoesMenu.RETA;
            case 7:
                return OpcoesMenu.PONTO;
            case 8:
                return OpcoesMenu.APAGAR;
            case 9:
                return OpcoesMenu.APAGAR;
            case 10:
                return OpcoesMenu.APAGAR;
            case 11:
                return OpcoesMenu.LISTAR;
            case 12:
                return OpcoesMenu.DESENHAR;
            default:
                return OpcoesMenu.SAIR;
        }
    }

    public String askApagar() {
        basic.ShowMsg("DIGITE O ID DA FIGURA QUE DESEJA APAGAR: ");
        setId(basic.AskString());
        return getId();
    }

    public String askEditar() {
        basic.ShowMsg("DIGITE O ID DA FIGURA QUE DESEJA EDITAR: ");
        setId(basic.AskString());
        return getId();
    }

}
