package br.com.exercicios.negocio;

import javax.swing.JTextField;

/**
 *
 * @author William
 */
public class ManterMediaNegocio {

    private JTextField campoNota1;
    private JTextField campoNota2;
    private JTextField campoNota3;

    public ManterMediaNegocio(JTextField campoNota1, JTextField campoNota2, JTextField campoNota3) {
        this.campoNota1 = campoNota1;
        this.campoNota2 = campoNota2;
        this.campoNota3 = campoNota3;
    }
    
    
    public static  Double fazMedia(JTextField campoNota1 , JTextField campoNota2, JTextField campoNota3) {
        Double n1 = Double.valueOf(campoNota1.getText());
        Double n2 = Double.valueOf(campoNota2.getText());
        Double n3 = Double.valueOf(campoNota3.getText());
        
        Double media = (n1 + n2 + n3) / 3 ;
        return media;
    }

}
