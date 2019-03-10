/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.principal;

import br.com.exercicios.view.DigitacaoAutomatica;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class Exercicio02TelaDigitacao {
    
    public static void main(String[] args) {
        JanelaDigitacao();
    }
    
    public static void JanelaDigitacao() {
        DigitacaoAutomatica janelaPrincipal = new DigitacaoAutomatica();
        janelaPrincipal.setTitle("JANELA PRINCIPAL");
        janelaPrincipal.setSize(350, 350);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
    }
}
