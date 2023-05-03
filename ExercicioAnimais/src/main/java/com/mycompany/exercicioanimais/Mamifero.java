package com.mycompany.exercicioanimais;

/**
 *
 * @author Ferna
 */
public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, int comprimento, int numPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, 4, cor, "Terra", velocidade);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public String alimento() {
        return this.alimento;
    }

    @Override
    public String dados() {
        return super.dados() + "\nAlimento: " + alimento;
    }
}
