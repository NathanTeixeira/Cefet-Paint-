package View;

import Model.OpcoesMenu;
import Model.Retangulo;
import Model.Retangulo_Enum;

public class Retangulo_View {

    private basicView basic;
    private Retangulo retangulo;

    public Retangulo_View() {
        basic = new basicView();
    }

    public Retangulo askRetangulo() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DA BASE: ");
        int base = basic.scn.nextInt();
        basic.ShowMsg("DIIGITE O VALOR DA ALTURA: ");
        int altura = basic.scn.nextInt();
        basic.ShowMsg("\n");
        retangulo = new Retangulo(id, base, altura);
        return retangulo;
    }

    public Retangulo editarRetangulo() {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        retangulo.setId(basic.AskString());
        basic.ShowMsg("DIGITE O VALOR DA NOVA BASE: ");
        retangulo.setBase(basic.AskInt());
        basic.ShowMsg("DIIGITE O VALOR DA NOVA ALTURA: ");
        retangulo.setAltura(basic.scn.nextInt());
        return retangulo;
    }

    public Retangulo_Enum menuRetangulo() {
        basic.ShowMsg("***MENU RETANGULO***\n"
                + "1 - NOVO RETANGULO\n"
                + "2 - EDITAR RETANGULO\n"
                + "3 - LISTAR RETANGULOS\n"
                + "4 - MOSTRAR RETANGULOS\n"
                + "5 - EXCLUIR RETANGULO\n"
                + "0 - VOLTAR\n");

        int opcao = basic.AskInt();

        switch (opcao) {
            case 1:
                return Retangulo_Enum.NOVO;
            case 2:
                return Retangulo_Enum.EDITAR;
            case 3:
                return Retangulo_Enum.LISTAR_TIPOS;
            case 4:
                return Retangulo_Enum.MOSTRAR;
            case 5:
                return Retangulo_Enum.EXCLUIR;
            default:
                return Retangulo_Enum.VOLTAR;
        }
    }

}
