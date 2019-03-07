package br.com.exercicios.control;

import br.com.exercicios.model.Distancia;
import br.com.exercicios.view.DistanciaEntrePontos;

/**
 *
 * @author William
 */
public class ControlDistancia {

    private static Distancia distancia;

    private static Double calculaVelocidadeMedia() {
        Double resultado = distancia.getDistancia() / Double.valueOf(String.valueOf(DistanciaEntrePontos.campoTempoViagem.getText()));
        return resultado;
    }

    private static Double calculaGastoCombustivel() {
        Double resultado = distancia.getDistancia() / Double.valueOf(DistanciaEntrePontos.campoGastoCombustivel.getText());
        return resultado;
    }

    public static void mostrandoTudoAction() {
        DistanciaEntrePontos.campoDistanciaPontos.setText(br.com.exercicios.util.UtilFormat.decimalFormat(distancia.getDistancia()));
        DistanciaEntrePontos.campoVelocidadeMedia.setText(br.com.exercicios.util.UtilFormat.decimalFormat(ControlDistancia.calculaVelocidadeMedia()));
        DistanciaEntrePontos.campoAutonomiaVeiculo.setText(br.com.exercicios.util.UtilFormat.decimalFormat(calculaGastoCombustivel()));
    }

}
