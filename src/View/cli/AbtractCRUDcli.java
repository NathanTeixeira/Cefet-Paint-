package View.cli;

import Model.FIgurasEnum;
import View.ICRUDView;

public abstract class AbtractCRUDcli<T> extends basicView implements ICRUDView<T> {

    @Override
    public FIgurasEnum menuPrincipal() {
        ShowMsg("***MENU***\n"
                + "1 - NOVO\n"
                + "2 - EDITAR\n"
                + "3 - LISTAR\n"
                + "4 - MOSTRAR\n"
                + "5 - EXCLUIR\n"
                + "0 - VOLTAR\n");

        int opcao = scn.nextInt();

        switch (opcao) {
            case 1:
                return FIgurasEnum.NOVO;
            case 2:
                return FIgurasEnum.EDITAR;
            case 3:
                return FIgurasEnum.LISTAR_TIPOS;
            case 4:
                return FIgurasEnum.MOSTRAR;
            case 5:
                return FIgurasEnum.EXCLUIR;
            default:
                return FIgurasEnum.VOLTAR;
        }
    }

    @Override
    public Boolean delete(T toDelete) {
        this.read(toDelete);
        return null;
    }
    
    @Override
    public String list(){
        return "ffff";
    }

}
