package br.com.exercicios.model;

/**
 *
 * @author Will
 */
public class Posicao {

    private final Integer posicaoX = br.com.exercicios.util.UtilMath.numRandom(50, 450);
    private final Integer posicaoY = br.com.exercicios.util.UtilMath.numRandom(50, 450);

    
    public Integer getPosicaoX() {
        return posicaoX;
    }

    public Integer getPosicaoY() {
        return posicaoY;
    }


}
