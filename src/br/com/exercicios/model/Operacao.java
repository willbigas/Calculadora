package br.com.exercicios.model;

/**
 *
 * @author William
 */
public class Operacao {

    private Numeros numeros;

    public Operacao() {
    }

    public Operacao(Numeros numeros) {
        this.numeros = numeros;
    }

    public Numeros getNumeros() {
        return numeros;
    }

    public void setNumeros(Numeros numeros) {
        this.numeros = numeros;
    }

    public Double getSoma() {
        return numeros.getNumero1() + numeros.getNumero2();
    }

    public Double getSubtracao() {
        return numeros.getNumero1() - numeros.getNumero2();
    }

    public Double getMultiplicacao() {
        return numeros.getNumero1() * numeros.getNumero2();
    }

    public Double getDivisao() {
        if (numeros.getNumero2() == 0) {
            return Double.MAX_VALUE;
        } else {
            return numeros.getNumero1() / numeros.getNumero2();
        }

    }
}
