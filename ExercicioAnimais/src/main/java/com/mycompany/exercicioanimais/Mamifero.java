package com.mycompany.exercicioanimais;

/**
 *
 * @author aluno
 */
public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, int comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, 4, cor, "Terra ", velocidade);
    }
    
    
}
