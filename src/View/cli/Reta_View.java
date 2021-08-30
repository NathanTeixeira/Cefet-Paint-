package View.cli;

import Model.Reta;
import View.ICRUDView;

public class Reta_View extends AbtractCRUDcli<Reta> implements ICRUDView<Reta> {

    private basicView basic;
    private Reta reta;

    public Reta_View() {
        basic = new basicView();
    }

    @Override
    public Reta create() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O TAMANHO DA RETA: ");
        int fim = basic.scn.nextInt();
        basic.ShowMsg("\n");
        reta = new Reta(id, fim);
        return reta;
    }

    @Override
    public void read(Reta conta) {
        basic.ShowMsg("FIGURA: " + reta.getTipo() + "\n");
        basic.ShowMsg("ID: " + reta.getId() + "\n");
        basic.ShowMsg(reta.getDimensoes() + "\n");
        basic.ShowMsg("AREA: " + reta.getArea() + "\n");
        basic.ShowMsg("PERIMETRO: " + reta.getPerimetro() + "\n");
        basic.ShowMsg("DIAGONAL: " + reta.getDiagonal() + "\n");
        basic.ShowMsg("** \n");
    }

    @Override
    public Reta update(Reta toSabe) {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        reta.setId(basic.AskString());
        basic.ShowMsg("DIGITE O TAMANHO DA RETA: ");
        reta.setFim(basic.AskInt());
        return reta;
    }

    @Override
    public String list() {
        return "RETA";
    }

}
