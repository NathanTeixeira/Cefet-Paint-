package View.cli;

import Model.Reta;
import View.ICRUDView;

public class Reta_View extends AbtractCRUDcli<Reta> implements ICRUDView<Reta> {

    private final basicView basic;
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
        basic.ShowMsg(reta + "\n");
    }

    @Override
    public Reta update(Reta toSabe) {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        reta.setId(basic.AskString());
        basic.ShowMsg("DIGITE O TAMANHO DA RETA: ");
        reta.setFim(basic.AskInt());
        return reta;
    }

}
