package com.mycompany.exercicioingresso;

/**
 *
 * @author aluno
 */
public class ExercicioIngresso {

    public static void main(String[] args) {
        
        Ingresso a = new Ingresso(200);
        System.out.println(a);
        
        IngressoVIP b = new IngressoVIP(200, 120);
        System.out.println(b);
    }
}
