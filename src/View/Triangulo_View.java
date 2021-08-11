package View;

import Model.OpcoesMenu;
import Model.Triangulo;
import Model.Triangulo_Enum;

public class Triangulo_View {

    private basicView basic;
    private Triangulo triangulo;

    public Triangulo_View() {
        basic = new basicView();
    }

    public Triangulo askTriangulo() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DA BASE: ");
        int base = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DA ALTURA: ");
        int altura = basic.scn.nextInt();
        basic.ShowMsg("\n");
        triangulo = new Triangulo(id, base, altura);
        return triangulo;
    }

    public Triangulo editarTriangulo() {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        triangulo.setId(basic.AskString());
        basic.ShowMsg("DIGITE O VALOR DA NOVA BASE: ");
        triangulo.setBase(basic.AskInt());
        basic.ShowMsg("DIIGITE O VALOR DA NOVA ALTURA: ");
        triangulo.setAltura(basic.scn.nextInt());
        return triangulo;
    }

    public Triangulo_Enum menuTriangulo() {
        basic.ShowMsg("***MENU TRIANGULO***\n"
                + "1 - NOVO TRIANGULO\n"
                + "2 - EDITAR TRIANGULO\n"
                + "3 - LISTAR TRIANGULOS\n"
                + "4 - MOSTRAR TRIANGULOS\n"
                + "5 - EXCLUIR TRIANGULO\n"
                + "0 - VOLTAR\n");

        int opcao = basic.AskInt();

        switch (opcao) {
            case 1:
                return Triangulo_Enum.NOVO;
            case 2:
                return Triangulo_Enum.EDITAR;
            case 3:
                return Triangulo_Enum.LISTAR_TIPOS;
            case 4:
                return Triangulo_Enum.MOSTRAR;
            case 5:
                return Triangulo_Enum.EXCLUIR;
            default:
                return Triangulo_Enum.VOLTAR;
        }
    }
}
