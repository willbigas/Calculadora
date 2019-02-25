/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.negocio;

import javax.swing.JTextField;

/**
 *
 * @author William
 */
public class ManterDigitacaoNegocio {

    private JTextField campo1;
    private JTextField campo2;

    public ManterDigitacaoNegocio(JTextField campo1, JTextField campo2) {
        this.campo1 = campo1;
        this.campo2 = campo2;
    }
    
    public static String verificandoEscrita(JTextField campo1){
        String teste = String.valueOf(campo1);
        return teste;
    }

}
