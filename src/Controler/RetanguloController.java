package Controler;

import DAO.dao;
import Model.Retangulo;
import View.cli.Retangulo_View;

public class RetanguloController extends AbstractCRUDcontroller<Retangulo> {

    public RetanguloController(dao p) {
        super(p);
        crud = new Retangulo_View();
    }

}
