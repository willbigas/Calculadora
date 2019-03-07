package br.com.exercicios.model;

/**
 *
 * @author William
 */
public class Numeros {

    private Double numero1;
    private Double numero2;

    public Numeros() {
        super();
    }

    public Numeros(Double numero1, Double numero2) {
        super();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero1(String n1) {
        this.numero1 = Double.valueOf(n1);
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public void setNumero2(String n2) {
        this.numero2 = Double.valueOf(n2);
    }

}
