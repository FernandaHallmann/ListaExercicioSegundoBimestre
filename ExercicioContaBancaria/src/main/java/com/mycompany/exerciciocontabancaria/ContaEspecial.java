package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author Ferna
 */
public class ContaEspecial extends ContaBancaria{
    private float limite;
    
    public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor > (saldo + limite)){
            System.out.println("Limite insuficiente");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public String mostraDados() {
        return super.mostraDados() + "\nLimite: " + limite;
    }
    
    
}
