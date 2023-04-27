package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;
    
    public ContaPoupanca(String cliente, int numConta, float saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSaldo(float taxa) {
        super.depositar((taxa / 100) * diaRendimento);
    }
    
}
