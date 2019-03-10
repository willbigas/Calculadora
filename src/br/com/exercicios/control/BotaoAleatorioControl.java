/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.control;

import br.com.exercicios.model.Posicao;
import br.com.exercicios.view.BotaoAleatorio;

/**
 *
 * @author Alunos
 */
public class BotaoAleatorioControl {

    Posicao posicao = new Posicao();

    public void randomizandoBotaoAction() {
        BotaoAleatorio.botaoRandomico.setLocation(posicao.getPosicaoX(), posicao.getPosicaoY());
    }

}
