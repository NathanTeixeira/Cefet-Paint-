package View.cli;

import Model.Ponto;
import View.ICRUDView;

public class Ponto_View extends AbtractCRUDcli<Ponto> implements ICRUDView<Ponto> {
    
    private final basicView basic;
    private Ponto ponto;
    
    public Ponto_View() {
        basic = new basicView();
    }
    
    @Override
    public Ponto create() {
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
    
    @Override
    public void read(Ponto conta) {
        basic.ShowMsg(ponto + "\n");
    }
    
    @Override
    public Ponto update(Ponto toSabe) {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        ponto.setId(basic.AskString());
        basic.ShowMsg("DIGITE O NOVO VALOR DE X: ");
        ponto.setCoordenadaX(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O NOVO VALOR DE Y: ");
        ponto.setCoordenadaY(basic.scn.nextInt());
        return ponto;
    }
    
}
