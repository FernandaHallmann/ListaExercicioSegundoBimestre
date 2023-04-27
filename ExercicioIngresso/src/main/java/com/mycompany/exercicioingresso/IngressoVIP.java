package com.mycompany.exercicioingresso;

/**
 *
 * @author aluno
 */
public class IngressoVIP extends Ingresso{
    private float valorAdicional;
    
    public IngressoVIP(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Valor VIP: R$" + (valor + valorAdicional);
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    
}
