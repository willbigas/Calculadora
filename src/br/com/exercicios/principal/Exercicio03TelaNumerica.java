package br.com.exercicios.principal;

import br.com.exercicios.view.DigitacaoAutomatica;
import br.com.exercicios.view.DigitacaoNumerica;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class Exercicio03TelaNumerica {
    
    public static void main(String[] args) {
        JanelaDigitacaoNumerica();
    }
    
    public static void JanelaDigitacaoNumerica() {
        DigitacaoNumerica janelaPrincipal = new DigitacaoNumerica();
        janelaPrincipal.setTitle("JANELA PRINCIPAL");
        janelaPrincipal.setSize(350, 350);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
    }
}
