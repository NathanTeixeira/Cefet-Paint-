
package Controler;

import DAO.dao;
import Model.Trapezio;
import View.cli.Trapezio_View;


public class TrapezioController extends AbstractCRUDcontroller<Trapezio>{
    
    public TrapezioController(dao p){
        super(p);
        crud = new Trapezio_View();
    }
    
}
