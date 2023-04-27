package com.mycompany.exercicioingresso;

/**
 *
 * @author aluno
 */
public class Ingresso {
    protected float valor;
    
    public Ingresso(float valor) {
        this.valor = valor;
    }
 
    @Override
    public String toString() {
        return "Valor: R$" + valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
