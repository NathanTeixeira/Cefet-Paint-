package View;

import Model.FIgurasEnum;

public interface ICRUDView<T> extends IBasic {

    public FIgurasEnum menuPrincipal();

    public T create();

    public void read(T conta);

    public T update(T toSabe);

    public Boolean delete(T toDelete);

    public String list();

}
