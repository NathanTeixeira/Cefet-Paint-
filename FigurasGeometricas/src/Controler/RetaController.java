
package Controler;

import DAO.dao;
import Model.Reta;
import View.cli.Reta_View;


public class RetaController extends AbstractCRUDcontroller<Reta> {
    
    public RetaController(dao p){
        super(p);
        crud = new Reta_View();
    }
    
}
