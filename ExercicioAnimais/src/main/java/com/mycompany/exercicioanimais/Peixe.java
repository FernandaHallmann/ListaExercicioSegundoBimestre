package com.mycompany.exercicioanimais;

/**
 *
 * @author Ferna
 */
public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe(String nome, int comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, 0, "Cinzento", "Mar", velocidade);
    }

    public void setCaracteristicas() {     
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    @Override
    public String dados() {
        return super.dados() + "\nCaracteristicas: " + caracteristicas;
    }
}
