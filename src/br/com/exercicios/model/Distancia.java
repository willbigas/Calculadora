package br.com.exercicios.model;

/**
 *
 * @author Alunos
 */
public class Distancia {

    private Ponto ponto1;
    private Ponto ponto2;
    private Double tempo;
    private Double consumo;

    public Distancia() {
    }

    public Distancia(Ponto ponto1, Ponto ponto2, Double tempo, Double consumo) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.tempo = tempo;
        this.consumo = consumo;
    }

    public Ponto getPonto1() {
        return ponto1;
    }

    public void setPonto1(Ponto ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto getPonto2() {
        return ponto2;
    }

    public void setPonto2(Ponto ponto2) {
        this.ponto2 = ponto2;
    }

    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public Double getDistancia() {
        Double latitude = ponto2.getLatitude() - ponto1.getLatitude();
        Double longitude = ponto2.getLongitude() - ponto1.getLongitude();
        Double latitudeElevado = Math.pow(latitude, 2);
        Double longitudeElevado = Math.pow(longitude, 2);
        Double calculoDeRaiz = latitudeElevado + longitudeElevado;
        Double resultadoFinal = Math.sqrt(calculoDeRaiz);
        return resultadoFinal;

    }

    public Double GetVelocidadeMedia() {
        Double resultado = getDistancia() / getTempo();
        return resultado;
    }

    public Double getAutonomiaVeiculo() {
        Double resultado = getDistancia() / getConsumo();
        return resultado;
    }

    @Override
    public String toString() {
        return "Distancia{" + "ponto1=" + ponto1 + ", ponto2=" + ponto2 + ", tempo=" + tempo + ", consumo=" + consumo + '}';
    }

}
