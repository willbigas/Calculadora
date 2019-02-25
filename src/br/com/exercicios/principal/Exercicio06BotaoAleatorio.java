/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.principal;

import br.com.exercicios.view.BotaoAleatorio;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class Exercicio06BotaoAleatorio {

    public static void main(String[] args) {
        JanelaBotaoAleatorio();
    }

    public static void JanelaBotaoAleatorio() {
        BotaoAleatorio janelaPrincipal = new BotaoAleatorio();
        janelaPrincipal.setTitle("JANELA PRINCIPAL");
        janelaPrincipal.setSize(600, 600);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
    }
}
