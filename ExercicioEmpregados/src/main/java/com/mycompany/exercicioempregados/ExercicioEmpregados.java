package com.mycompany.exercicioempregados;

/**
 *
 * @author aluno
 */
public class ExercicioEmpregados {

    public static void main(String[] args) {
        Empregado a = new Empregado("Fernanda", 10000);
        System.out.println(a);
        
        Gerente b = new Gerente("Joana D'arc", 20000, "Desenvolvimento");
        System.out.println(b);
        
        Vendedor c = new Vendedor("Maria Antonieta", 5000, 20);
        System.out.println(c);
    }
}
