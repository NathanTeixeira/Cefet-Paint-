
package View;

import Model.OpcoesMenu;


public interface IMenu extends IBasic{
    
    public OpcoesMenu askOpcao();
    
    public String askApagar();
    
    public String askEditar();
    
    public String askMostrar();
    
    public String askApagarId();
}
