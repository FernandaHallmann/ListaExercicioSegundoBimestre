package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author Ferna
 */
public class ContaBancaria {
    private String cliente;
    private int numConta;
    protected float saldo;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    } 
    
    public void sacar(float valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }
    
    public void depositar(float valor) {
        this.saldo += valor;
    }
    
    public String mostraDados() {
        return "\nCliente: " + cliente + "\nNúmero da conta: " + numConta + "\nSaldo: " + saldo;
    }
}
