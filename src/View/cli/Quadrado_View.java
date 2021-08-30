package View.cli;

import Model.Quadrado;
import View.ICRUDView;

public class Quadrado_View extends AbtractCRUDcli<Quadrado> implements ICRUDView<Quadrado> {

    private basicView basic;
    private Quadrado quadrado;

    public Quadrado_View() {
        basic = new basicView();
    }

    @Override
    public Quadrado create() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O TAMANHO DO LADO DO QUADRADO: ");
        int lado = basic.scn.nextInt();
        quadrado = new Quadrado(id, lado);
        return quadrado;
    }

    @Override
    public void read(Quadrado conta) {
        basic.ShowMsg("FIGURA: " + quadrado.getTipo() + "\n");
        basic.ShowMsg("ID: " + quadrado.getId() + "\n");
        basic.ShowMsg(quadrado.getDimensoes() + "\n");
        basic.ShowMsg("AREA: " + quadrado.getArea() + "\n");
        basic.ShowMsg("PERIMETRO: " + quadrado.getPerimetro() + "\n");
        basic.ShowMsg("DIAGONAL: " + quadrado.getDiagonal() + "\n");
        basic.ShowMsg("** \n");
    }

    @Override
    public String list() {
        return "QUADRADO";
    }

    @Override
    public Quadrado update(Quadrado toSabe) {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        quadrado.setId(basic.AskString());
        basic.ShowMsg("DIGITE O NOVO TAMANHO DO LADO DO QUADRADO: ");
        quadrado.setlado(basic.scn.nextInt());
        return quadrado;
    }

}
