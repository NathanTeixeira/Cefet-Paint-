package Model;

public class Texto implements Renderizar {

    private String conteudo;
    private String cor;
    private int fonte;

    public Texto(String conteudo, String cor, int fonte) {
        this.conteudo = conteudo;
        this.cor = cor;
        this.fonte = fonte;
    }

    @Override
    public void renderizar() {
        escrever();
    }

    public void escrever() {
        setConteudo(conteudo);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getFonte() {
        return fonte;
    }

    public void setFonte(int fonte) {
        this.fonte = fonte;
    }

}
