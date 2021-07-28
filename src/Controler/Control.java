
package Controler;

import Model.FiguraGeometrica;
import View.Viewer;


public class Control {
    
    private FiguraGeometrica[] figuras;
    private Viewer viewer;
    
    public Control(){
        figuras = new FiguraGeometrica[10];
        viewer = new Viewer();
        //MUdei uma linha
    }
    
}
