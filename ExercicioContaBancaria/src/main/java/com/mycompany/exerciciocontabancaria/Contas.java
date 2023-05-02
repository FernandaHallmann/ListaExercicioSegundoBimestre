package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author Ferna
 */
public class Contas {

    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria("Fernanda", 1, 12000);
        a.sacar(1300);
        a.depositar(200);
        System.out.println(a.mostraDados());
        
        ContaPoupanca b = new ContaPoupanca("Vinicius", 2, 90000, 6);
        b.sacar(100);
        b.depositar(900);
        b.calcularNovoSaldo(10);      
        System.out.println(b.mostraDados());
        
        ContaEspecial c = new ContaEspecial("Bart", 3, 10000, 2500);
        c.sacar(900);
        c.depositar(300);
        System.out.println(c.mostraDados());
    }
}
