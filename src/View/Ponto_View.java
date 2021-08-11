package View;

import Model.OpcoesMenu;
import Model.Ponto;
import Model.Ponto_Enum;

public class Ponto_View {

    private basicView basic;
    private Ponto ponto;

    public Ponto_View() {
        basic = new basicView();
    }

    public Ponto askPonto() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DE X: ");
        int coordenadaX = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DE Y: ");
        int coordenadaY = basic.scn.nextInt();
        basic.ShowMsg("\n");        
        ponto = new Ponto(id, coordenadaX, coordenadaY);
        return ponto;
    }
    
        public Ponto editarPonto() {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        ponto.setId(basic.AskString());
        basic.ShowMsg("DIGITE O NOVO VALOR DE X: ");
        ponto.setCoordenadaX(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O NOVO VALOR DE Y: ");
        ponto.setCoordenadaY(basic.scn.nextInt());
        return ponto;
    }

    public Ponto_Enum menuPonto() {
        basic.ShowMsg("***MENU PONTO***\n"
                + "1 - NOVO PONTO\n"
                + "2 - EDITAR PONTO\n"
                + "3 - LISTAR PONTOS\n"
                + "4 - MOSTRAR PONTOS\n"
                + "5 - EXCLUIR PONTOS\n"
                + "0 - VOLTAR\n");

        int opcao = basic.AskInt();

        switch (opcao) {
            case 1:
                return Ponto_Enum.NOVO;
            case 2:
                return Ponto_Enum.EDITAR;
            case 3:
                return Ponto_Enum.LISTAR_TIPOS;
            case 4:
                return Ponto_Enum.MOSTRAR;
            case 5:
                return Ponto_Enum.EXCLUIR;
           default:
                return Ponto_Enum.VOLTAR;
        }
    }

}
