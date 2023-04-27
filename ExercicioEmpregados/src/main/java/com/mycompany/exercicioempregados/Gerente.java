package com.mycompany.exercicioempregados;

/**
 *
 * @author aluno
 */
public class Gerente extends Empregado{
    private String departamento;

    public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente\nNome: " + super.getNome() + "\nSalario: " + super.getSalario() + "\nDepartamento: " + departamento;
    }
    
}
