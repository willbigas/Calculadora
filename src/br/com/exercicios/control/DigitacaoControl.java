/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.control;

import br.com.exercicios.model.Janela;
import br.com.exercicios.view.DigitacaoAutomatica;

/**
 *
 * @author William
 */
public class DigitacaoControl {

    Janela janela;

    public DigitacaoControl() {
        janela = new Janela();
    }

    public void recebendoDadosForm() {
        janela.setCampo1(DigitacaoAutomatica.campo1.getText());
        System.out.println("Campo1 :" + janela.getCampo1());
        System.out.println("Campo2 :" + janela.getCampo2());
    }

    public void escrevendoAction() {
        recebendoDadosForm();
        janela.escrevendo();
        DigitacaoAutomatica.campo2.setText(janela.getCampo2());
    }

}
