package com.mycompany.exercicioanimais;

/**
 *
 * @author Ferna
 */
public class TesteAnimais {

    public static void main(String[] args) {
        Animal a = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);
        Peixe b = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5);
        b.setCaracteristicas();
        Mamifero c = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");
        
        System.out.println("Zoo:");
        enfeite();
        System.out.println(a.dados());
        enfeite();
        System.out.println(b.dados());
        enfeite();
        System.out.println(c.dados());
    }
    
    public static void enfeite () {
        System.out.println("--------------------------------------");
    }
}
