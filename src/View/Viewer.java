package View;

import Model.OpcoesMenu;
import Model.Ponto;
import Model.Quadrado;
import Model.Reta;
import Model.Retangulo;
import Model.Trapezio;
import Model.Triangulo;
import java.util.Scanner;

public class Viewer {

    protected Scanner scn;

    public Viewer() {
        scn = new Scanner(System.in);
    }

    public void ShowMsg(String msg) {
        System.out.print(msg);
    }

    public int AskInt() {
        return scn.nextInt();
    }
    
    public String AskString() {
        return scn.next();
    }
    

}
