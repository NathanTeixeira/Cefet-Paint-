package DAO;

import Model.FiguraGeometrica;
import View.basicView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class dao {

    private basicView basic;

    public void salvar(FiguraGeometrica[] figuras) {
        FileOutputStream arquivo = null;
        try {
            arquivo = FileOutputStream("N:\\CEFET\\PC2\\Figuras Geometricas");
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

    public FiguraGeometrica[] carregar() {
        FiguraGeometrica[] figuras;
        try {
            FileInputStream carregarArquivo = new FileInputStream("N:\\CEFET\\PC2\\Figuras Geometricas");
            ObjectInputStream in = new ObjectInputStream(carregarArquivo);
            figuras = (FiguraGeometrica[]) in.readObject();
        } catch (IOException ex) {
            basic.ShowMsg("ERRO");
            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex) {
            basic.ShowMsg("ERRO");
            ex.printStackTrace();
            return null;
        } catch (Exception ex){
            basic.ShowMsg("ERRO");
            ex.printStackTrace();
            return null; 
        }
        return figuras;
    }

    private FileOutputStream FileOutputStream(String ncefetpC2Figuras_Geometricas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
