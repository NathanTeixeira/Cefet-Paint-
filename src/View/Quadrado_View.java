package View;

import Model.Quadrado;
import Model.Quadrado_Enum;

public class Quadrado_View {

    private Viewer basic;

    public Quadrado_View() {
        basic = new Viewer();
    }

    public Quadrado askQuadrado() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O TAMANHO DO LADO DO QUADRADO: ");
        int lado = basic.scn.nextInt();
        Quadrado quadrado;
        quadrado = new Quadrado(id, lado);
        return quadrado;
    }
    
        public Quadrado_Enum menuQuadrado() {
        basic.ShowMsg("***MENU QUADRADO***\n"
                + "1 - NOVO QUADRADO\n"
                + "2 - EDITAR QUADRADO\n"
                + "3 - LISTAR QUADRADOS\n"
                + "4 - MOSTRAR QUADRADOS\n"
                + "5 - EXCLUIR QUADRADO\n"
                + "0 - VOLTAR\n");

        int opcao = basic.scn.nextInt();

        switch (opcao) {
            case 1:
                return Quadrado_Enum.NOVO;
            case 2:
                return Quadrado_Enum.EDITAR;
            case 3:
                return Quadrado_Enum.LISTAR_TIPOS;
            case 4:
                return Quadrado_Enum.MOSTRAR;
            case 5:
                return Quadrado_Enum.EXCLUIR;
           default:
                return Quadrado_Enum.VOLTAR;
        }
    }

}
