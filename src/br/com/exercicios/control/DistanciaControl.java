package br.com.exercicios.control;

import br.com.exercicios.model.Distancia;
import br.com.exercicios.model.Ponto;
import br.com.exercicios.view.DistanciaEntrePontos;

/**
 *
 * @author William
 */
public class DistanciaControl {

    public DistanciaControl() {

        resgatarDadosForm();
    }

    public static Distancia resgatarDadosForm() {
        Distancia distancia = new Distancia();
        distancia.setTempo(Double.valueOf(DistanciaEntrePontos.campoTempoViagem.getText()));
        distancia.setConsumo(Double.valueOf(DistanciaEntrePontos.campoGastoCombustivel.getText()));
        Double latitudep1 = Double.valueOf(DistanciaEntrePontos.campoLatitudeInicial.getText());
        Double longitudep1 = Double.valueOf(DistanciaEntrePontos.campoLongitudeInicial.getText());
        Double latitudep2 = Double.valueOf(DistanciaEntrePontos.campoLatitudeFinal.getText());
        Double longitudep2 = Double.valueOf(DistanciaEntrePontos.campoLongitudeFinal.getText());
        Ponto p1 = new Ponto(latitudep1, longitudep1);
        Ponto p2 = new Ponto(latitudep2, longitudep2);
        distancia.setPonto1(p1);
        distancia.setPonto2(p2);
        return distancia;
    }

    public static void mostrandoTudoAction() {
        Distancia distancia = resgatarDadosForm();
        DistanciaEntrePontos.campoDistanciaPontos.setText(br.com.exercicios.util.UtilFormat.decimalFormat(distancia.getDistancia()));
        DistanciaEntrePontos.campoVelocidadeMedia.setText(br.com.exercicios.util.UtilFormat.decimalFormat(distancia.GetVelocidadeMedia()));
        DistanciaEntrePontos.campoAutonomiaVeiculo.setText(br.com.exercicios.util.UtilFormat.decimalFormat(distancia.getAutonomiaVeiculo()));
    }

}
