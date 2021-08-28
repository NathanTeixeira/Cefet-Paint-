package View.cli;

import Model.Retangulo;
import View.ICRUDView;

public class Retangulo_View extends AbtractCRUDcli<Retangulo> implements ICRUDView<Retangulo> {
    
    private final basicView basic;
    private Retangulo retangulo;
    
    public Retangulo_View() {
        basic = new basicView();
    }
    
    @Override
    public Retangulo create() {
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
    
    @Override
    public void read(Retangulo conta) {
        basic.ShowMsg(retangulo + "\n");
    }
    
    @Override
    public Retangulo update(Retangulo toSabe) {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        retangulo.setId(basic.AskString());
        basic.ShowMsg("DIGITE O VALOR DA NOVA BASE: ");
        retangulo.setBase(basic.AskInt());
        basic.ShowMsg("DIIGITE O VALOR DA NOVA ALTURA: ");
        retangulo.setAltura(basic.scn.nextInt());
        return retangulo;
    }
    
}
