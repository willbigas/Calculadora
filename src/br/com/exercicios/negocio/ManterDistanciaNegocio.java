package br.com.exercicios.negocio;

import javafx.scene.input.KeyCode;
import javax.swing.JTextField;

/**
 *
 * @author William
 */
public class ManterDistanciaNegocio {

    private JTextField campoAutonomiaVeiculo;
    private JTextField campoDistanciaPontos;
    private JTextField campoLatitudeFinal;
    private JTextField campoLatitudeInicial;
    private JTextField campoLongitudeFinal;
    private JTextField campoLongitudeInicial;
    private JTextField campoTempoViagem;
    private JTextField campoVelocidadeMedia;
    private JTextField campoGastoCombustivel;

    public ManterDistanciaNegocio(JTextField campoAutonomiaVeiculo, JTextField campoDistanciaPontos, 
            JTextField campoLatitudeFinal, JTextField campoLatitudeInicial, JTextField campoLongitudeFinal,
            JTextField campoLongitudeInicial, JTextField campoTempoViagem, 
            JTextField campoVelocidadeMedia , JTextField campoGastoCombustivel) {
        this.campoAutonomiaVeiculo = campoAutonomiaVeiculo;
        this.campoDistanciaPontos = campoDistanciaPontos;
        this.campoLatitudeFinal = campoLatitudeFinal;
        this.campoLatitudeInicial = campoLatitudeInicial;
        this.campoLongitudeFinal = campoLongitudeFinal;
        this.campoLongitudeInicial = campoLongitudeInicial;
        this.campoTempoViagem = campoTempoViagem;
        this.campoVelocidadeMedia = campoVelocidadeMedia;
        this.campoGastoCombustivel = campoGastoCombustivel;
    }

    public static Double calculaDistancia(JTextField campoLatitudeInicial,
            JTextField campoLatitudeFinal, JTextField campoLongitudeInicial, JTextField campoLongitudeFinal) {
        Double latitude = Double.valueOf(String.valueOf(campoLatitudeFinal.getText())) - Double.valueOf(String.valueOf(campoLatitudeInicial.getText()));
        Double longitude = Double.valueOf(String.valueOf(campoLongitudeFinal.getText())) - Double.valueOf(String.valueOf(campoLongitudeInicial.getText()));
        Double latitudeElevado = Math.pow(latitude, 2);
        Double longitudeElevado = Math.pow(longitude, 2);
        Double calculoDeRaiz = latitudeElevado + longitudeElevado;
        Double resultadoFinal = Math.sqrt(calculoDeRaiz);
        return resultadoFinal;
    }

    public static Double calculaVelocidadeMedia(Double valor, JTextField campoTempoViagem) {
        Double resultado = valor / Double.valueOf(String.valueOf(campoTempoViagem.getText()));
        return resultado;
    }
    
    public static Double calculaGastoCombustivel(Double valor , JTextField campoGastoCombustivel) {
        Double resultado = valor / Double.valueOf(campoGastoCombustivel.getText());
        return resultado;
    }

}
