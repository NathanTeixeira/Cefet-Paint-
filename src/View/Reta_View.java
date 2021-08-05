package View;

import Model.OpcoesMenu;
import Model.Reta;
import Model.Reta_Enum;

public class Reta_View {

    private Viewer basic;

    public Reta_View() {
        basic = new Viewer();
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

    public Reta_Enum menuReta() {
        basic.ShowMsg("***MENU RETA***\n"
                + "1 - NOVO RETA\n"
                + "2 - EDITAR RETA\n"
                + "3 - LISTAR RETAS\n"
                + "4 - MOSTRAR RETAS\n"
                + "5 - EXCLUIR RETA\n"
                + "0 - VOLTAR\n");

        int opcao = basic.AskInt();

        switch (opcao) {
            case 1:
                return Reta_Enum.NOVO;
            case 2:
                return Reta_Enum.EDITAR;
            case 3:
                return Reta_Enum.LISTAR_TIPOS;
            case 4:
                return Reta_Enum.MOSTRAR;
            case 5:
                return Reta_Enum.EXCLUIR;
            default:
                return Reta_Enum.VOLTAR;
        }
    }

}
