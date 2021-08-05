package View;

import Model.OpcoesMenu;
import Model.Trapezio;
import Model.Trapezio_Enum;

public class Trapezio_View {

    private Viewer basic;

    public Trapezio_View() {
        basic = new Viewer();
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

    public Trapezio_Enum menuTrapezio() {
        basic.ShowMsg("***MENU TRAPEZIO***\n"
                + "1 - NOVO TRAPEZIO\n"
                + "2 - EDITAR TRAPEZIO\n"
                + "3 - LISTAR TRAPEZIOS\n"
                + "4 - MOSTRAR TRAPEZIOS\n"
                + "5 - EXCLUIR TRAPEZIO\n"
                + "0 - VOLTAR\n");

        int opcao = basic.AskInt();

        switch (opcao) {
            case 1:
                return Trapezio_Enum.NOVO;
            case 2:
                return Trapezio_Enum.EDITAR;
            case 3:
                return Trapezio_Enum.LISTAR_TIPOS;
            case 4:
                return Trapezio_Enum.MOSTRAR;
            case 5:
                return Trapezio_Enum.EXCLUIR;
            default:
                return Trapezio_Enum.VOLTAR;
        }
    }

}
