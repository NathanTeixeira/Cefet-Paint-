package Controler;

import DAO.dao;
import Model.Ponto;
import View.cli.Ponto_View;

public class PontoController extends AbstractCRUDcontroller<Ponto> {

    public PontoController(dao p) {
        super(p);
        crud = new Ponto_View();
    }

}
