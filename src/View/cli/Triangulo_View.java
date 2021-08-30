package View.cli;

import Model.Triangulo;
import View.ICRUDView;

public class Triangulo_View extends AbtractCRUDcli<Triangulo> implements ICRUDView<Triangulo> {

    private final basicView basic;
    private Triangulo triangulo;

    public Triangulo_View() {
        basic = new basicView();
    }

    @Override
    public Triangulo create() {
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

    @Override
    public void read(Triangulo conta) {
        basic.ShowMsg("FIGURA: " + triangulo.getTipo() + "\n");
        basic.ShowMsg("ID: " + triangulo.getId() + "\n");
        basic.ShowMsg(triangulo.getDimensoes() + "\n");
        basic.ShowMsg("AREA: " + triangulo.getArea() + "\n");
        basic.ShowMsg("PERIMETRO: " + triangulo.getPerimetro() + "\n");
        basic.ShowMsg("DIAGONAL: " + triangulo.getDiagonal() + "\n");
        basic.ShowMsg("** \n");
    }

    @Override
    public Triangulo update(Triangulo toSabe) {
        basic.ShowMsg("DIGITE O NOVO ID DA FIGURA: ");
        triangulo.setId(basic.AskString());
        basic.ShowMsg("DIGITE O VALOR DA NOVA BASE: ");
        triangulo.setBase(basic.AskInt());
        basic.ShowMsg("DIIGITE O VALOR DA NOVA ALTURA: ");
        triangulo.setAltura(basic.scn.nextInt());
        return triangulo;
    }

    @Override
    public String list() {
        return "TRIANGULO";
    }
}
