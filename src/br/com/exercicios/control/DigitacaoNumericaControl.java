package br.com.exercicios.control;

import br.com.exercicios.model.Janela;
import br.com.exercicios.view.DigitacaoNumerica;

/**
 *
 * @author William
 */
public class DigitacaoNumericaControl {

    Janela janela;

    public DigitacaoNumericaControl() {
        janela = new Janela();
    }

    public void recebendoDadosForm() {
        janela.setCampo1(DigitacaoNumerica.campo1.getText());
        System.out.println("Campo1 :" + janela.getCampo1());
        System.out.println("Campo2 :" + janela.getCampo2());
    }

    public void fazendoTratamentoDeNumero() {
        String concatena = "";
        concatena += janela.getCampo1();
        janela.setCampo2(concatena.replaceAll("[^0-9]", ""));
        concatena = "";
    }

    public void escrevendoAction() {
        recebendoDadosForm();
        fazendoTratamentoDeNumero();
        DigitacaoNumerica.campo2.setText(janela.getCampo2());
    }

}
