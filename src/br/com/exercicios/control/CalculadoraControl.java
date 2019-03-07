package br.com.exercicios.control;

import br.com.exercicios.model.Numeros;
import br.com.exercicios.model.Operacao;
import br.com.exercicios.view.JanelaCalculadora;

/**
 *
 * @author William
 */
public class CalculadoraControl {

    private Operacao operacao;

    public CalculadoraControl() {
        operacao = new Operacao();
    }

    private Numeros resgatarNumerosTela() {
        Numeros numeros = new Numeros();
        numeros.setNumero1(JanelaCalculadora.campo1.getText());
        numeros.setNumero2(JanelaCalculadora.campo2.getText());
        return numeros;
    }

    public void somarAction() {
        operacao.setNumeros(resgatarNumerosTela());
        JanelaCalculadora.campoResultado.setText(String.valueOf(operacao.getSoma()));
    }
    public void subtrairAction() {
        operacao.setNumeros(resgatarNumerosTela());
        JanelaCalculadora.campoResultado.setText(String.valueOf(operacao.getSubtracao()));
    }
    public void multiplicacaoAction() {
        operacao.setNumeros(resgatarNumerosTela());
        JanelaCalculadora.campoResultado.setText(String.valueOf(operacao.getMultiplicacao()));
    }
    public void divisaoAction() {
        operacao.setNumeros(resgatarNumerosTela());
        JanelaCalculadora.campoResultado.setText(String.valueOf(operacao.getDivisao()));
    }

    

}
