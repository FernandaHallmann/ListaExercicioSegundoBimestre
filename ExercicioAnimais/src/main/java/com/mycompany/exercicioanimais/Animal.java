package com.mycompany.exercicioanimais;

/**
 *
 * @author Ferna
 */
public class Animal {
    protected String nome;
    protected int comprimento;
    protected int numPatas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;

    public Animal(String nome, int comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public String dados() {
        return "Animal: " + nome + "\nComprimento: " + comprimento + "cm\nPatas: " + numPatas + "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + "m/s";
    }
}
