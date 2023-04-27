package com.mycompany.exercicioanimais;

/**
 *
 * @author aluno
 */
public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe(String nome, int comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, 0, "Cinzento", ambiente, velocidade);
    }

    public void setCaracteristicas() {     
        this.caracteristicas = "Barbatanas e cauda";
    }
}
