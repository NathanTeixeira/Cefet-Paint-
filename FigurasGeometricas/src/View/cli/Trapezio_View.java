package View.cli;

import Model.Trapezio;
import View.ICRUDView;

public class Trapezio_View extends AbtractCRUDcli<Trapezio> implements ICRUDView<Trapezio> {
    
    private final basicView basic;
    private Trapezio trapezio;
    
    public Trapezio_View() {
        basic = new basicView();
    }
    
    @Override
    public Trapezio create() {
        basic.ShowMsg("DIGITE O ID DA FIGURA: ");
        String id = basic.scn.next();
        basic.ShowMsg("DIGITE O VALOR DA BASE INFERIOR:");
        int baseInferior = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DA BASE SUPERIOR: ");
        int baseSuperior = basic.scn.nextInt();
        basic.ShowMsg("DIGITE O VALOR DA ALTURA: ");
        int altura = basic.scn.nextInt();
        basic.ShowMsg("\n");
        trapezio = new Trapezio(id, baseInferior, baseSuperior, altura);
        return trapezio;
    }
    
    @Override
    public void read(Trapezio conta) {
        basic.ShowMsg(trapezio + "\n");
    }
    
    @Override
    public Trapezio update(Trapezio toSabe) {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        trapezio.setId(basic.AskString());
        basic.ShowMsg("DIGITE O NOVO VALOR DA BASE INFERIOR:");
        trapezio.setBaseInferior(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O NOVO VALOR DA BASE SUPERIOR: ");
        trapezio.setBaseSuperior(basic.scn.nextInt());
        basic.ShowMsg("DIGITE O NOVO VALOR DA ALTURA: ");
        trapezio.setAltura(basic.scn.nextInt());
        return trapezio;
    }
    
}
