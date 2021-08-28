package View.cli;

import Model.Texto;

public class Texto_View {

    private basicView basic;
    private Texto texto;

    public Texto_View() {
        basic = new basicView();
    }

    public Texto askTexto() {
        basic.ShowMsg("DIGITE O SEU TEXTO: ");
        String conteudo = basic.AskString();
        basic.ShowMsg("DIGITE A COR DO SEU TEXTO: ");
        String cor = basic.AskString();
        basic.ShowMsg("DIGITE A FONTE DO SEU TEXTO: ");
        int fonte = basic.AskInt();
        texto = new Texto(conteudo, cor, fonte);
        return texto;
    }

}
