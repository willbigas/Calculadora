/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.negocio;

import javax.swing.JButton;

/**
 *
 * @author Alunos
 */
public class ManterBotaoAleatorioNegocio {

    private JButton jButton1;

    public ManterBotaoAleatorioNegocio(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public static void randomizandoBotao(JButton jButton1) {
        jButton1.setLocation(br.com.exercicios.util.UtilMath.numRandom(50, 450),
                br.com.exercicios.util.UtilMath.numRandom(50, 450));
    }

}
