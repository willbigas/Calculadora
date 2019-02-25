package br.com.exercicios.negocio;

import javax.swing.JTextField;

/**
 *
 * @author William
 */
public class ManterCalculadoraNegocio {

    private JTextField campo1;
    private JTextField campo2;
    private JTextField campoResultado;

    public ManterCalculadoraNegocio(JTextField campo1, JTextField campo2, JTextField campoResultado) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campoResultado = campoResultado;
    }

    public static String somarCampos(JTextField campo1, JTextField campo2) {
        Integer valor1 = Integer.valueOf(campo1.getText());
        Integer valor2 = Integer.valueOf(campo2.getText());
        Integer soma = valor1 + valor2;
        String valorTotal = String.valueOf(soma);
        return valorTotal;
    }

    public static String subtrairCampos(JTextField campo1, JTextField campo2) {
        Integer valor1 = Integer.valueOf(campo1.getText());
        Integer valor2 = Integer.valueOf(campo2.getText());
        Integer subtracao = valor1 - valor2;
        String valorTotal = String.valueOf(subtracao);
        return valorTotal;
    }

    public static String multiplicarCampos(JTextField campo1, JTextField campo2) {
        Integer valor1 = Integer.valueOf(campo1.getText());
        Integer valor2 = Integer.valueOf(campo2.getText());
        Integer multiplicacao = valor1 * valor2;
        String valorTotal = String.valueOf(multiplicacao);
        return valorTotal;
    }

    public static String dividirCampos(JTextField campo1, JTextField campo2) {
        Integer valor1 = Integer.valueOf(campo1.getText());
        Integer valor2 = Integer.valueOf(campo2.getText());
        Integer divisao = valor1 / valor2;
        String valorTotal = String.valueOf(divisao);
        return valorTotal;
    }

}
