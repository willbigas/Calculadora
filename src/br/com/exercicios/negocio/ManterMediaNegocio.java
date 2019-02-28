package br.com.exercicios.negocio;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author William
 */
public class ManterMediaNegocio {

    private JTextField campoNota1;
    private JTextField campoNota2;
    private JTextField campoNota3;
    private JLabel Media;
    private JLabel Situacao;

    public ManterMediaNegocio(JTextField campoNota1, JTextField campoNota2, JTextField campoNota3, JLabel Media, JLabel Situacao) {
        this.campoNota1 = campoNota1;
        this.campoNota2 = campoNota2;
        this.campoNota3 = campoNota3;
        this.Media = Media;
        this.Situacao = Situacao;
    }

    public static Double fazMedia(JTextField campoNota1, JTextField campoNota2, JTextField campoNota3) {
        Double n1 = Double.valueOf(campoNota1.getText());
        Double n2 = Double.valueOf(campoNota2.getText());
        Double n3 = Double.valueOf(campoNota3.getText());

        Double media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static void gerandoMedia(JTextField campoNota1, JTextField campoNota2, JTextField campoNota3, JLabel Media, JLabel Situacao) {
        Double teste = ManterMediaNegocio.fazMedia(campoNota1, campoNota2, campoNota3);
        Media.setText(br.com.exercicios.util.UtilFormat.decimalFormat(teste));
        if (teste > 6.9) {
            Situacao.setForeground(Color.green);
            Situacao.setText("Aprovado");
        } else {
            Situacao.setForeground(Color.red);
            Situacao.setText("Reprovado");
        }
    }

}
