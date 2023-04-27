package com.mycompany.exercicioempregados;

/**
 *
 * @author aluno
 */
public class Vendedor extends Empregado{
    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }
    
    public float calcularSalario(){
        return (super.getSalario() + (super.getSalario() * (percentualComissao / 100)));
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public String toString() {
        return "Vendedor\nNome: " + super.getNome() + "\nSalário sem comissão: R$" + super.getSalario() + "\nSalário com comissão: R$" + this.calcularSalario() + "\nPercentual de comissão: " + percentualComissao + "%";
    }
    
    
    
}
