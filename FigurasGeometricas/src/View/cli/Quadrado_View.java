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
        basic.ShowMsg(quadrado+"\n");
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
