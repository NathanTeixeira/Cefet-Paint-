package Controler;

import Model.FIgurasEnum;

public interface ICRUDcontroller<T> {

    public FIgurasEnum MENU();

    public T create();

    public void read(T conta);

    public T update(T cliSalvar);

    public Boolean delete(T cliDeletar);

    public void list();

}
