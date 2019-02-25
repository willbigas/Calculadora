package br.com.exercicios.principal;

import br.com.exercicios.view.DistanciaEntrePontos;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class Exercicio05DistanciaPontos {
    
    public static void main(String[] args) {
        JanelaDistanciaPontos();
    }
    
    public static void JanelaDistanciaPontos() {
        DistanciaEntrePontos janelaPrincipal = new DistanciaEntrePontos();
        janelaPrincipal.setTitle("JANELA PRINCIPAL");
        janelaPrincipal.setSize(550, 400);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
    }
}
