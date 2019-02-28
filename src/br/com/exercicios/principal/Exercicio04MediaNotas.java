package br.com.exercicios.principal;

import br.com.exercicios.view.MediaNotas;
import javax.swing.JFrame;

/**
 *
 * @author William
 */
public class Exercicio04MediaNotas {
    
    
    public static void main(String[] args) {
        JanelaNotas();
    }
    
     public static void JanelaNotas() {
         MediaNotas janelaPrincipal = new MediaNotas();
        janelaPrincipal.setTitle("JANELA PRINCIPAL");
        janelaPrincipal.setSize(350, 350);
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
}
    }
