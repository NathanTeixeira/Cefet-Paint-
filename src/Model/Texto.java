
package Model;


public class Texto {
    
    private String conteudo;
    private int cor;
    private int fonte;

    public Texto(String conteudo, int cor, int fonte) {
        this.conteudo = conteudo;
        this.cor = cor;
        this.fonte = fonte;
    }
    

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getFonte() {
        return fonte;
    }

    public void setFonte(int fonte) {
        this.fonte = fonte;
    }
    
    
}
