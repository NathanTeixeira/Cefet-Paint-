package Controler;

import DAO.dao;
import Model.OpcoesMenu;
import View.cli.Menu_View;
import View.cli.basicView;

public class Control {

    private final basicView basic;
    private final Menu_View menuview;
    private OpcoesMenu escolha;
    private final dao persistencia;
    private final AbstractCRUDcontroller quadradocontroller;
    private final AbstractCRUDcontroller retangulocontroller;
    private final AbstractCRUDcontroller trapeziocontroller;
    private final AbstractCRUDcontroller triangulocontroller;
    private final AbstractCRUDcontroller retacontroller;
    private final AbstractCRUDcontroller pontocontroller;

    public Control() {
        basic = new basicView();
        menuview = new Menu_View();
        persistencia = new dao();
        quadradocontroller = new QuadradoController(persistencia);
        retangulocontroller = new RetanguloController(persistencia);
        trapeziocontroller = new TrapezioController(persistencia);
        triangulocontroller = new TrianguloController(persistencia);
        retacontroller = new RetaController(persistencia);
        pontocontroller = new PontoController(persistencia);
    }
//iii

    public void printMenu() {
        escolha = OpcoesMenu.LISTAR;
        do {
            escolha = menuview.askOpcao();
            basic.ShowMsg("################################# \n");
            basic.ShowMsg("Você escolheu: " + escolha + "\n\n");
            switch (escolha) {
                case QUADRADO:
                    quadradocontroller.MENU();
                    break;
                case RETANGULO:
                    retangulocontroller.MENU();
                    break;
                case TRAPEZIO:
                    trapeziocontroller.MENU();
                    break;
                case TRIANGULO:
                    triangulocontroller.MENU();
                    break;
                case RETA:
                    retacontroller.MENU();
                    break;
                case PONTO:
                    pontocontroller.MENU();
                    break;
                case APAGAR:
                    basic.ShowMsg("########################## \n\n");
                    persistencia.ler();
                    if (persistencia.excluir() == true) {
                        basic.ShowMsg("SUCESSO AO APAGAR! \n");
                        basic.ShowMsg("########################## \n\n");
                        break;
                    } else {
                        basic.ShowMsg("FALHA AO APAGAR! \n");
                        basic.ShowMsg("########################## \n\n");
                        break;
                    }
                case SALVAR:
                    persistencia.salvar();
                    break;
                case RECARREGAR:
                    boolean r = persistencia.carregar();
                    break;
                case LISTAR:
                    basic.ShowMsg("**LISTA** \n");
                    persistencia.ler();
                    basic.ShowMsg("###################### \n\n");
                    break;
                case DESENHAR:
                    basic.ShowMsg("coming soon");
                    break;
                case SAIR:
                    basic.ShowMsg("ADIOS!!!");
                    break;
                default:
            }

        } while (escolha != OpcoesMenu.SAIR);
    }
}
