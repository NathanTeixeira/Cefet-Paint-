package View.cli;

import View.IBasic;
import java.util.InputMismatchException;
import java.util.Scanner;

public class basicView implements IBasic {

    protected Scanner scn;

    public basicView() {
        scn = new Scanner(System.in);
    }

    @Override
    public void ShowMsg(String msg) {
        System.out.print(msg);
    }

    @Override
    public int AskInt() {
        boolean erro = true;
        int x = 0;
        do {
            try {
                x = scn.nextInt();
                erro = false;
            } catch (InputMismatchException ex) {
                scn.next();
                ShowMsg("VALOR DIGITADO INVÁLIDO! TENTE NOVAMENTE:\n");
                erro = true;
            }
        } while (erro);
        return x;
    }

    @Override
    public String AskString() {
        boolean erro = true;
        String x = null;
        do {
            try {
                x = scn.next();
                erro = false;
            } catch (InputMismatchException ex) {
                scn.next();// Como o NextIntFalhou vc tem que descartar o valor digitado incorretamente
                ShowMsg("VALOR DIGITADO INVÁLIDO! TENTE NOVAMENTE:\n");
                erro = true;
            }

        } while (erro);
        return x;
    }

}
