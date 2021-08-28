package DAO;

import Model.FiguraGeometrica;
import View.cli.Menu_View;
import View.cli.basicView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class dao {

    private final basicView basic;
    private FiguraGeometrica[] figuras;
    private final Menu_View menuview;

    public dao() {
        figuras = new FiguraGeometrica[10];
        basic = new basicView();
        menuview = new Menu_View();
    }

    public FiguraGeometrica[] getFiguras() {
        return figuras;
    }

    public void setFiguras(FiguraGeometrica[] figuras) {
        this.figuras = figuras;
    }

    public boolean inserir(FiguraGeometrica f) {
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] == null) {
                figuras[i] = f;
                return true;
            }
        }
        return false;
    }

    public void mostrar(int i) {
        if (figuras[i] != null) {
            basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
            basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
            basic.ShowMsg(figuras[i].getDimensoes() + "\n");
            basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
            basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
            basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
            basic.ShowMsg("** \n");
        }
    }

    public boolean editar() {
        menuview.askEditar();
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                if (menuview.getId().equals(figuras[i].getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean excluir() {
        menuview.askApagar();
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                if (menuview.getId().equals(figuras[i].getId())) {
                    figuras[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ler() {
        basic.ShowMsg("**LISTA** \n");
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] != null) {
                basic.ShowMsg("FIGURA: " + figuras[i].getTipo() + "\n");
                basic.ShowMsg("ID: " + figuras[i].getId() + "\n");
                basic.ShowMsg(figuras[i].getDimensoes() + "\n");
                basic.ShowMsg("AREA: " + figuras[i].getArea() + "\n");
                basic.ShowMsg("PERIMETRO: " + figuras[i].getPerimetro() + "\n");
                basic.ShowMsg("DIAGONAL: " + figuras[i].getDiagonal() + "\n");
                basic.ShowMsg("** \n");
                return true;
            }
        }
        return false;
    }

    public void salvar() {
        FileOutputStream arquivo;
        try {
            arquivo = new FileOutputStream("N:\\CEFET\\PC2\\" + figuras + ".java");
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            out.writeObject(figuras);
        } catch (FileNotFoundException e) {
            basic.ShowMsg("ERRO");
            e.printStackTrace();
        } catch (IOException e) {
            basic.ShowMsg("ERRO");
            e.printStackTrace();
        }
        basic.ShowMsg("FIGURA SALVA COM SUCESSO\n");
    }

    public boolean carregar() {
        try {
            FileInputStream carregarArquivo = new FileInputStream("N:\\CEFET\\PC2\\" + figuras);
            ObjectInputStream in = new ObjectInputStream(carregarArquivo);
            figuras = (FiguraGeometrica[]) in.readObject();
        } catch (IOException ex) {
            basic.ShowMsg("ERRO");
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            basic.ShowMsg("ERRO");
            ex.printStackTrace();
            return false;
        } catch (Exception ex) {
            basic.ShowMsg("ERRO");
            ex.printStackTrace();
            return false;
        }
        return true;
    }

}
