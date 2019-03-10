package br.com.exercicios.model;

import javax.swing.JTextField;

/**
 *
 * @author Will
 */
public class Janela {

    private String campo1;
    private String campo2;

    public Janela() {
        escrevendo();
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    
    
    public void escrevendo() {
        this.setCampo2(this.getCampo1());
    }

}
