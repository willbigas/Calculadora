/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.principal;

import br.com.exercicios.view.JanelaCalculadora;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class Exercicio01Calculadora {

    public static void main(String[] args) {
        JanelaPrincipal();
    }

    public static void JanelaPrincipal() {
        JanelaCalculadora janelaPrincipal = new JanelaCalculadora();
        janelaPrincipal.setTitle("JANELA PRINCIPAL");
        janelaPrincipal.setSize(350, 350);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
    }
    
//    public static void JanelaPrincipalNula() {
//        JanelaCalculadora janelaPrincipal = new JanelaCalculadora(null);
//        janelaPrincipal.setTitle("JANELA PRINCIPAL");
//        janelaPrincipal.setSize(350, 350);
//        janelaPrincipal.setLocationRelativeTo(null);
//        janelaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        janelaPrincipal.setVisible(true);
//    }
}
