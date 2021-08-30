package Controler;

import DAO.dao;
import Model.Quadrado;
import View.cli.Quadrado_View;

public class QuadradoController extends AbstractCRUDcontroller<Quadrado> {

    public QuadradoController(dao p) {
        super(p);
        crud = new Quadrado_View();
    }

}
