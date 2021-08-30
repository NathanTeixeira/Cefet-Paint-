
package Controler;

import DAO.dao;
import Model.Triangulo;
import View.cli.Triangulo_View;


public class TrianguloController extends AbstractCRUDcontroller<Triangulo> {
    
    public TrianguloController(dao p){
        super(p);
        crud = new Triangulo_View();
    }
    
}
