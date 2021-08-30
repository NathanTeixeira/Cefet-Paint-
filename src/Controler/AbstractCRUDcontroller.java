package Controler;
//777
import DAO.dao;
import Model.FIgurasEnum;
import Model.FiguraGeometrica;
import View.ICRUDView;
import View.cli.Menu_View;
import View.cli.basicView;

public class AbstractCRUDcontroller<T> implements ICRUDcontroller<T> {

    private final basicView basic;
    protected ICRUDView<T> crud;
    private final dao pers;
    private final Menu_View menuview;
    private T t = null;

    public AbstractCRUDcontroller(dao pers) {
        basic = new basicView();
        menuview = new Menu_View();
        this.pers = pers;
    }

    @Override
    public FIgurasEnum MENU() {
        FIgurasEnum escolha;
        do {
            escolha = crud.menuPrincipal();
            basic.ShowMsg("Você escolheu: " + escolha + "\n\n");
            switch (escolha) {
                case NOVO:
                    t = create();
                    pers.inserir((FiguraGeometrica) t);
                    break;
                case EDITAR:
                    if (pers.editar() == true) {
                        update(t);
                    } else {
                        basic.ShowMsg("FALHA AO EDITAR\n");
                    }
                    break;
                case LISTAR_TIPOS:
                    basic.ShowMsg("***LISTA***\n");
                    list();
                    break;
                case MOSTRAR:
                    read(t);
                    break;
                case EXCLUIR:
                    if (delete(t) == true) {
                        basic.ShowMsg("FIGURA APGADA\n");
                    } else {
                        basic.ShowMsg("FALHA AO APAGAR\n");
                    }
                    break;
                case VOLTAR:
                    break;
                default:
            }
        } while (escolha != FIgurasEnum.VOLTAR);
        return FIgurasEnum.VOLTAR;
    }

    @Override
    public T create() {
        return crud.create();
    }

    @Override
    public void read(T conta) {
        menuview.askMostrar();
        for (int i = 0; i < pers.getFiguras().length; i++) {
            if (pers.getFiguras()[i] != null) {
                crud.read(t);
            }
        }
    }

    @Override
    public T update(T cliSalvar) {
        return crud.update(t);
    }

    @Override
    public Boolean delete(T cliDeletar) {
        menuview.askApagar();
        for (int i = 0; i < pers.getFiguras().length; i++) {
            if (pers.getFiguras()[i] != null) {
                if (menuview.getId().equals(pers.getFiguras()[i].getId())) {
                    pers.getFiguras()[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void list() {
        for (int i = 0; i < pers.getFiguras().length; i++) {
            if (pers.getFiguras()[i] != null) {
                if (pers.getFiguras()[i].getTipo().equals(crud.list())) {
                    basic.ShowMsg("FIGURA: " + pers.getFiguras()[i].getTipo() + "\n");
                    basic.ShowMsg("ID: " + pers.getFiguras()[i].getId() + "\n");
                    basic.ShowMsg(pers.getFiguras()[i].getDimensoes() + "\n");
                    basic.ShowMsg("AREA: " + pers.getFiguras()[i].getArea() + "\n");
                    basic.ShowMsg("PERIMETRO: " + pers.getFiguras()[i].getPerimetro() + "\n");
                    basic.ShowMsg("DIAGONAL: " + pers.getFiguras()[i].getDiagonal() + "\n");
                    basic.ShowMsg("** \n");
                }
            }
        }
    }
}
